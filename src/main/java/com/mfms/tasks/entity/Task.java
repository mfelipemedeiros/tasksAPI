package com.mfms.tasks.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Entity
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tasks")
public class Task extends RepresentationModel<Task> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;

    @Column(name = "dt_create")
    private DateTimeFormat dtcreate;
    @Column(name = "dt_limit")
    private DateTimeFormat dtlimit;


}
