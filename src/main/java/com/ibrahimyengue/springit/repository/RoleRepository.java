package com.ibrahimyengue.springit.repository;

import com.ibrahimyengue.springit.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
