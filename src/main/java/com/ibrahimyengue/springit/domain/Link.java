package com.ibrahimyengue.springit.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // comments
    @OneToMany(mappedBy = "link")
    private List<Comment> commetnts = new ArrayList<>();
}