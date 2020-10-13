package com.ibrahimyengue.springit.service.impl;

import com.ibrahimyengue.springit.entity.Link;
import com.ibrahimyengue.springit.repository.LinkRepository;
import com.ibrahimyengue.springit.service.LinkService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinkServiceImpl implements LinkService {

    private LinkRepository linkRepository;

    public LinkServiceImpl(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public List<Link> findAll(){
        return linkRepository.findAll();
    }

    @Override
    public Optional<Link> findById(Long id){
        Optional<Link> link = linkRepository.findById(id);
        return link;
    }

    @Override
    public Link creatLink(Link link){
        return linkRepository.save(link);
    }
}
