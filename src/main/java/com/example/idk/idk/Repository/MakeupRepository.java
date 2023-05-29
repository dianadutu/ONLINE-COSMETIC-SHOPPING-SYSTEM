package com.example.idk.idk.Repository;

import com.example.idk.idk.Entity.Makeup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeupRepository extends JpaRepository<Makeup, Long> {
}
