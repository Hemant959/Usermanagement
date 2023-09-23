package com.Hemant.UserManagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private Integer userId;
    private String userName;
    private String userMobile;
    private String userEmail;
    private String userDob;
    private LocalDate Date;

    private LocalTime Time;

}
