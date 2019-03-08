package com.freedompop.login.bussiness.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TokenDtoInt {
	@Getter @Setter
	private String token;
}
