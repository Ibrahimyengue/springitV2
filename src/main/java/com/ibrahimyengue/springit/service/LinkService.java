package com.ibrahimyengue.springit.service;

import com.ibrahimyengue.springit.entity.Link;

import java.util.List;
import java.util.Optional;

public interface LinkService {
    List<Link> findAll();
    Optional<Link> findById(Long id);
    Link creatLink(Link link);
}
