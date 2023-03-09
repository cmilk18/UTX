package com.midsangam.utx;

import com.midsangam.utx.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestService {

    @Autowired
    public SchoolRepository schoolRepository;
    @Autowired
    public StudentRepository studentRepository;

    public void test(){
        Optional<School> school = schoolRepository.findById(1);
        System.out.println(school.get().name);
    }
}
