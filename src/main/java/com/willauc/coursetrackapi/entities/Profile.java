package com.willauc.coursetrackapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @Column(name="bio")
    private String bio;

    @Column(name="phoneNumber")
    private String phoneNumber;

    @Column(name="dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name="loyaltyPoints")
    private Integer loyaltyPoint;

}
