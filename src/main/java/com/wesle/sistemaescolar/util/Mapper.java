package com.wesle.sistemaescolar.util;

import org.modelmapper.ModelMapper;

public class Mapper {
    private static final ModelMapper mapper = new ModelMapper();
    public  static <O,D> D  parseObject(O origin,Class<D> destination) {
        return mapper.map(origin, destination);
    }
}
