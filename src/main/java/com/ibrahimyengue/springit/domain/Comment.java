package com.ibrahimyengue.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends Auditable{

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String body;

    //link;
    @ManyToOne
    @NonNull
    private Link link;

}