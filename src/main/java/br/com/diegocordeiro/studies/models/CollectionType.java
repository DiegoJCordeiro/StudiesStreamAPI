package br.com.diegocordeiro.studies.models;

public enum CollectionType {

    LIST("List"),
    MAP("Map"),
    SET("Set");

    private final String name;
    CollectionType(String name){

        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
