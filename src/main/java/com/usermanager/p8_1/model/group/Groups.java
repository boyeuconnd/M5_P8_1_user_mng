package com.usermanager.p8_1.model.group;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_group")
@Data
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
