package com.sandraHerrera.workshop.springbootjava.models;


@Entity
@Table(name ="users)
public class User {
        @Id
        @GeneratedValue(Strategy =GenerationType.IDENTITY)
        private long id;

        @Column(lenght =300)
        private  String name;

        @ManyToOne
        @JoinColumnn(name = "user_id")
        private User user;








}
