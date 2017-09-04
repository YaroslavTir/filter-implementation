package com.yaroslavtir.parammapping;

import com.yaroslavtir.support.AbstractDto;
import lombok.Data;

import java.util.Map;

@Data
public class ParamMappingContainer<D, P> {

    private  Map<Class<AbstractDto<?>>,ParamMapper<D, P>> paramMappers;

}
