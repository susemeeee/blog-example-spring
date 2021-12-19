/*
 * MemberRepository.java
 * Author : 박찬형
 * Created Date : 2021-12-18
 */
package com.example.examplespringsecurity.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
