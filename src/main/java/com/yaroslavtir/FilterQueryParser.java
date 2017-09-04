package com.yaroslavtir;

import com.yaroslavtir.parammapping.ParamMapper;
import com.yaroslavtir.parammapping.ParamMappingContainer;
import com.yaroslavtir.parammapping.ParamMappingSupplier;
import com.yaroslavtir.paramparser.FilterParsingContext;
import com.yaroslavtir.support.AbstractDto;

public abstract class FilterQueryParser<D, P> {

    private ParamMappingSupplier<D, P> paramMappingSupplier;

    private ParamMappingContainer<D, P> paramMappingContainer;


    protected FilterQueryParser(ParamMappingSupplier<D, P> paramMappingSupplier) {
        this.paramMappingSupplier = paramMappingSupplier;
    }


    public void init() {
        this.paramMappingContainer = this.paramMappingSupplier.get();
    }

    public P parse(String filter, Class<AbstractDto<?>> dtoClass, D dataForParsing) {
        ParamMapper<D, P> paramMapper = paramMappingContainer
                .getParamMappers().get(dtoClass);
        //todo exception if don't have a properties

        FilterParsingContext<D, P> context = new FilterParsingContext<D, P>(paramMapper, dataForParsing);
        return this.parse(filter, context);
    }

    protected abstract P parse(String filter, FilterParsingContext<D, P> context);

}
