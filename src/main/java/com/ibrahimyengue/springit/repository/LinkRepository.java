package com.ibrahimyengue.springit.repository;

import com.ibrahimyengue.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

}