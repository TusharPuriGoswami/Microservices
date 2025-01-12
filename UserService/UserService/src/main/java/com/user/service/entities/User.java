package com.user.service.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL" , length = 20)
    private String email;

    @Column(name = "ABOUT")
    private String about;

    //Data base me save nhi kerna h
    @Transient
    private List<Rating> ratings = new  ArrayList<>();

}
