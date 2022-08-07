package com.rkaufusi.timeclockfullstack.repositories;

import com.rkaufusi.timeclockfullstack.entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {
}
