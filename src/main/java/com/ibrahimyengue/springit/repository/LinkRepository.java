package com.ibrahimyengue.springit.repository;

import com.ibrahimyengue.springit.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
    Link findByTitle(String title);
}