package com.midsangam.utx.repository;

import com.midsangam.utx.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
