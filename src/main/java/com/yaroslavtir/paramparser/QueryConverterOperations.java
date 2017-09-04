package com.yaroslavtir.paramparser;

import com.yaroslavtir.parammapping.ParamToEntityMapper;

public abstract class QueryConverterOperations<D, P, F> {

    public P isEquals(String field, String value, FilterParsingContext<D, F> filterParsingContext){

        ParamToEntityMapper<D, F> paramToEntityMapper = filterParsingContext.getParamMapper()
                .getMapperByParamName().get(field);

        D dataForParsing = filterParsingContext.getDataForParsing();
        F condition = paramToEntityMapper.mapping(dataForParsing);
        return isEquals(condition, value);
    }

    protected abstract P isEquals(F condition, String value);

}
