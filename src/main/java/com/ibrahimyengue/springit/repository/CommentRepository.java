package com.ibrahimyengue.springit.repository;

import com.ibrahimyengue.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
