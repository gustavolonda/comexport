package com.comexport.accounts.user.infraestructure.adapters;

import static com.comexport.accounts.user.infraestructure.confing.Constants.ACCOUNT_MODULE;
import static com.comexport.accounts.user.infraestructure.confing.Constants.ACCOUNT_SERVICE;

import org.springframework.stereotype.Component;

import com.comexport.accounts.user.domains.data.UserDTO;
import com.comexport.accounts.user.infraestructure.entities.UserEntity;
import com.comexport.commons.api.infraestructure.adapters.EndPointGenericAdapterImpl;

@Component
public class UserAdapter extends EndPointGenericAdapterImpl<UserDTO, UserEntity> implements IUserAdapter{

	@Override
	public String nameModule() {
		return ACCOUNT_MODULE;
	}

	@Override
	public String className() {
		return ACCOUNT_SERVICE;
	}

	@Override
	public UserDTO toModelDTO(UserEntity entity) {
		return new UserDTO().builder()
							.id(entity.getId())
							.firstName(entity.getFirstName())
							.lastName(entity.getLastName())
							.phoneNumber(entity.getPhoneNumber())
							.photoPath(entity.getPhotoPath())
							.build();
	}

	@Override
	public UserEntity toEntity(UserDTO userDTO) {
		return  new UserEntity().builder()
							.id(userDTO.getId())
							.firstName(userDTO.getFirstName())
							.lastName(userDTO.getLastName())
							.phoneNumber(userDTO.getPhoneNumber())
							.photoPath(userDTO.getPhotoPath())
							.build();
	}

}
