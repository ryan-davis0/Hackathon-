package main.model;

public class Tuple<I, II> {
    public I first;
    public II second;

    public Tuple(I f, II s) {
        first = f;
        second = s;
    }
}