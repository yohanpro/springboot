package com.example.demo.repository;


import com.example.demo.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}