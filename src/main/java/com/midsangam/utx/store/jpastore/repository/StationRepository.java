package com.midsangam.utx.store.jpastore.repository;

import com.midsangam.utx.store.jpastore.jpo.StationJpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StationRepository extends JpaRepository<StationJpo, Integer> {
}