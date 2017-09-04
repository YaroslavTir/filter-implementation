package com.yaroslavtir;

import com.yaroslavtir.support.AbstractDto;

public abstract class FilterRequestCreator<D, P, R> {

    private FilterQueryParser<D, P> filterQueryParser;

    public R create(String filter) {
        D dataForParsing = initAndReturnDataForParsing();
        P parsedParams = filterQueryParser.parse(filter, getDtoClass(), dataForParsing);
        return addParamsAndCreate(parsedParams);
    }

    protected abstract D initAndReturnDataForParsing();

    protected abstract R addParamsAndCreate(P params);

    protected abstract Class<AbstractDto<?>> getDtoClass();


}
