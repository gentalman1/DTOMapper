package com.psp.dtomapper.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BasedClass {

	private final ModelMapper modelMapper;

	public BasedClass(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	public <S,D> D dtoToEntity(S dto, Class<D> entity) {
		return modelMapper.map(dto, entity);
	}

	public <S,D> D entityToDto(S entity, Class<D> dto) {
		return modelMapper.map(entity, dto);
	}
}
