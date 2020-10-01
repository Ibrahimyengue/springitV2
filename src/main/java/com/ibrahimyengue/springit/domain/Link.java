package com.ibrahimyengue.springit.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Link extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    // comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment){
        comments.add(comment);
    }
}