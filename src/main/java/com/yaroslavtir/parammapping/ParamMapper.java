package com.yaroslavtir.parammapping;

import lombok.Data;

import java.util.Map;
@Data
public class ParamMapper<D, P> {

    Map<String, ParamToEntityMapper<D, P>> mapperByParamName;
}
