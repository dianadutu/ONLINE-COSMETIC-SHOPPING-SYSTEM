package com.example.makeup.makeup.Repository;

import com.example.makeup.makeup.Entity.Makeup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeupRepository extends JpaRepository<Makeup, Long> {
}
