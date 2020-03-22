package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Entity
@Table(name = "menuitem")
@Data
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;

    @Column(name = "menu_type")
    @NotEmpty
    private String menuType;

    @NotEmpty
    private BigDecimal cost;

    @NotEmpty
    private String description;
}
