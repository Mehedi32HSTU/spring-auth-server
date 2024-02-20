package com.javabeans.springauthserver.repository;

import com.javabeans.springauthserver.entity.Role;
import com.javabeans.springauthserver.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRole(RoleName roleName);
}
