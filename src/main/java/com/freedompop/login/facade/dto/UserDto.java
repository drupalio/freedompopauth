package com.freedompop.login.facade.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	@Getter @Setter
	private String username;
	@Getter @Setter
	private String password;
}
