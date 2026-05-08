package com.diksha.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
	private int sno;
	private String sname;
	private String email;
	private String mobileNum;

}


