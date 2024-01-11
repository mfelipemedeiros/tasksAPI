package com.mfms.tasks.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;


@Entity(name = "User")
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;


}
