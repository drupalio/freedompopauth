package com.freedompop.login.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tokens")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idtoken")
	@Getter
	@Setter
	private int id;
	
	@Column(name="username")
	@Getter
	@Setter
    private String username;
	
	@Column(name="token")
	@Getter
	@Setter
	private String token;
	
}
