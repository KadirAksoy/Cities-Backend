package com.kadiraksoy.CitiesBackend.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob//büyük metinleri tutmak için kullanılır.
    @Column( length = 5000 )
    private String photo;
}
