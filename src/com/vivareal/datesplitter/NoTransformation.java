package com.vivareal.datesplitter;

public class NoTransformation<T> implements Function<T, T> {

    @Override
    public T apply(T t) {
	return t;
    }

}
