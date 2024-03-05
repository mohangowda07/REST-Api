package com.crud.RestApi.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int quantity;
private double price;
}
