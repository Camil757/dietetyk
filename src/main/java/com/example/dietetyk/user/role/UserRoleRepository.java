package com.example.dietetyk.user.role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

	UserRole findByRole(String role);
}
