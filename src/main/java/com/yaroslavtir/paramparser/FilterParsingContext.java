package com.yaroslavtir.paramparser;

import com.yaroslavtir.parammapping.ParamMapper;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FilterParsingContext<D, P> {

    private ParamMapper<D, P> paramMapper;

    private D dataForParsing;

}
