package com.ibrahimyengue.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
@Builder
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    //private Link link;

}