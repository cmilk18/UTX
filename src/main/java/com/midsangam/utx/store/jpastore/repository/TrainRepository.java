package com.midsangam.utx.store.jpastore.repository;

import com.midsangam.utx.model.Train;
import com.midsangam.utx.store.jpastore.jpo.TrainJpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TrainRepository extends JpaRepository<TrainJpo,Integer> {
}
