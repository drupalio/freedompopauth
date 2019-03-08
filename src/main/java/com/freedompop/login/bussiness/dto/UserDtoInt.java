package com.freedompop.login.bussiness.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoInt {
	@Getter @Setter
	private String userName;
	@Getter @Setter
	private String password;
}
