package com.example.quizzproject.model;

import com.example.quizzproject.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "t_token")
@Getter
@Setter
public class Token extends BaseEntity {
    @Column(length = 1000)
    private String token;
    private Date tokenExpDate;
}
