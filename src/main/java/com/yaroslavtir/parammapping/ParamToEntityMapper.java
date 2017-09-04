package com.yaroslavtir.parammapping;

import lombok.Data;

@Data
public interface ParamToEntityMapper<D, F> {

    F mapping(D dataForParsing);

}
