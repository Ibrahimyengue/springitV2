package com.ibrahimyengue.springit.service.impl;

import com.ibrahimyengue.springit.entity.Role;
import com.ibrahimyengue.springit.repository.RoleRepository;
import com.ibrahimyengue.springit.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
