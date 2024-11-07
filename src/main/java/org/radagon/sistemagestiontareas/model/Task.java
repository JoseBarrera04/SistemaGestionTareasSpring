package org.radagon.sistemagestiontareas.model;

import jakarta.persistence.*;

@Entity
public class Task {
    //Constructor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //Getters and Setters
}
