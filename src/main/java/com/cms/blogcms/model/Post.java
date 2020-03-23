package com.cms.blogcms.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="posts")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="post_title")
    private String postTitle;


    @ManyToOne(fetch = FetchType.LAZY , optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;

    @Column(name = "post_date")
    private Date postDate;

    @Column(name="post_image")
    private String postImage;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "post_tags")
    private String postTags;

    @Enumerated(value = EnumType.ORDINAL)
    private Status status;
}
