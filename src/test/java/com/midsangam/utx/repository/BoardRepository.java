package com.midsangam.utx.repository;

import com.midsangam.utx.entity.Board;
import com.midsangam.utx.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
