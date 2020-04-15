package com.cms.blogcms.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="posts")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    @JoinColumn(name = "post_cat_id" , referencedColumnName = "id")
    private Category category;

    @Column(name="post_title")
    private String postTitle;

    @ManyToOne(fetch = FetchType.EAGER , optional = false )
    @Fetch(FetchMode.JOIN)
    @MapsId("id")
    @JoinColumn(name = "post_author",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //if the fetch is lazy it creates any excption that serailizable class not found
//    @JsonIgnore ignores in json
    private User user;




    @Column(name="post_image")
    private String postImage;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "post_tags")
    private String postTags;

    @Enumerated(value = EnumType.STRING)
    @Column(name="post_status")
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTags() {
        return postTags;
    }

    public void setPostTags(String postTags) {
        this.postTags = postTags;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
