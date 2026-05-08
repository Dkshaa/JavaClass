package com.diksha.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	
	private int sno;
	private String sname;
	private String email;
	private String mobileNum;

}
