package com.carpiocg.models.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mascotas {
	private long id;
	private String name;
	private Date birthday;
	private String breed;
}
