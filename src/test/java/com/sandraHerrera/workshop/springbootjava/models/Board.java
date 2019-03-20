package com.sandraHerrera.workshop.springbootjava.models;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;


@Entity
@Table(name="boards")
public class Board {

    @Id
    @GeneratedValue(Strategy =GenerationType.IDENTITY)
    private long id;

    @Column(lenght =300, unique = true)
    private  String name;

    public Board(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return id == board.id &&
                Objects.equals(name, board.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
