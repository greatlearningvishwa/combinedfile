package com.microservice.combined.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerentity {
	private int id;
	private String name;
	private String mblno;
	private String email;
}
