package com.usermanager.p8_1.model;

import com.usermanager.p8_1.model.group.Groups;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    private Groups groups;



}
