package com.midsangam.utx;

import com.midsangam.utx.entity.School;
import com.midsangam.utx.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
