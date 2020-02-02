package com.devsai.mydaggerapp;

import dagger.Component;

@Component
public interface CarComponent {

    //component creates dependency graph

    //DAG - Directed acyclic graph

    //activity classes get object from classes they want to use

    //compile time code generation and not like prev reflection in dagger 1

    Car getCar();


}
