package com.ibrahimyengue.springit.service;

import com.ibrahimyengue.springit.entity.Role;

public interface RoleService {
    Role findByName(String name);
}
