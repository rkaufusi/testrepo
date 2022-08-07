package com.rkaufusi.timeclockfullstack.repositories;

import com.rkaufusi.timeclockfullstack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
