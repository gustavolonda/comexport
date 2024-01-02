package com.comexport.accounts.user.infraestructure.adapters;

import com.comexport.accounts.user.domains.data.UserDTO;
import com.comexport.accounts.user.infraestructure.entities.UserEntity;

public interface IUserAdapter {
	UserEntity toEntity(UserDTO userDTO);
}
