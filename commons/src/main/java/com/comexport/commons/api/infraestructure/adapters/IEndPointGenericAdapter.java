package com.comexport.commons.api.infraestructure.adapters;

import com.comexport.commons.api.domains.data.ResponseBase;

public interface IEndPointGenericAdapter {
	 ResponseBase toResponseBase(Object object);
}
