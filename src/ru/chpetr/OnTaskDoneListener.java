package ru.chpetr;

@FunctionalInterface
public interface OnTaskDoneListener {
        void onDone(String result);
}
