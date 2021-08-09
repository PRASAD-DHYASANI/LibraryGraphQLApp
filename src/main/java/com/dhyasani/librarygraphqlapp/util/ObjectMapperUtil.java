package com.dhyasani.librarygraphqlapp.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectMapperUtil {

    private static ModelMapper modelMapper = new ModelMapper();

    private ObjectMapperUtil() {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
    }

    public static <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }

    public static <S,T> T map(S source, Class<T> targetClass){
        return modelMapper.map(source,targetClass);
    }
}
