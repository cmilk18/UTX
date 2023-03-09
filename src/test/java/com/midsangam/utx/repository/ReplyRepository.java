package com.midsangam.utx.repository;

import com.midsangam.utx.entity.Board;
import com.midsangam.utx.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
