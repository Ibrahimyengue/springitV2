package com.ibrahimyengue.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Vote {

    @Id
    @GeneratedValue
    private Long id;
    //private Link link;
    private int vote;

}