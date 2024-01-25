package hello.hellospring.controller;

public @interface RequestParam {
    String value();

    boolean required();

    String name();
}
