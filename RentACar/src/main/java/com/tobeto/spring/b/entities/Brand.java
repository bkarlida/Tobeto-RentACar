package com.tobeto.spring.b.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    //mappedBy= > diğer classdaki attribute ismi
    @OneToMany(mappedBy = "brand") //attribute ismi
    @JsonIgnore // Bu alan jsona parse edilirse yok sayacak
    private List<Car> cars;
}
