package ru.chpetr;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
