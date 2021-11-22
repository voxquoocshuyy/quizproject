package com.example.quizzproject.model;

import com.example.quizzproject.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_permission")
@Getter
@Setter
public class Permission extends BaseEntity {
    private String permissionName;

    private String permissionKey;
}
