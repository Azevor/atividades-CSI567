package com.sample.abstract_factory_example;

public interface AbstractFactory<T> {
    T create(String type) ;
}