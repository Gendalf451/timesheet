package com.task1.timesheet.entities;

import javax.persistence.*;

@Entity
@Table(name = "position")
public class PositionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "POST")
    private String post;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public PositionEntity() {
    }
}
