package com.ibrahimyengue.springit.repository;

import com.ibrahimyengue.springit.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {

}