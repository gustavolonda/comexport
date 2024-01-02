package com.comexport.accounts.user.domains.data;

import com.comexport.accounts.user.infraestructure.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String photoPath;
}
