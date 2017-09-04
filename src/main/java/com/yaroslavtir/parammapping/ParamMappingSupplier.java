package com.yaroslavtir.parammapping;

public interface ParamMappingSupplier<D,P> {

    ParamMappingContainer<D, P> get();

}
