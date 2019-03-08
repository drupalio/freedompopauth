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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idUser")
	@Getter
	@Setter
	private int id;
	
	@NonNull
	@Column(name="username")
	@Getter
	@Setter
    private String username;
	
	@NonNull
	@Column(name="password")
	@Getter
	@Setter
	private String password;
}
