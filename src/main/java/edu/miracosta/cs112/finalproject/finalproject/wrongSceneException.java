package edu.miracosta.cs112.finalproject.finalproject;

public class wrongSceneException extends Exception {
    public wrongSceneException() {
        super();
    }
    public wrongSceneException(String message) {
        super(message);
    }

    public wrongSceneException(Throwable cause) {
        super(cause);
    }

    public wrongSceneException(String message, Throwable cause) {
        super(message, cause);
    }
    public wrongSceneException(String message, Throwable cause, boolean Suppression, boolean stacktrac) {
        super(message, cause, Suppression, stacktrac);
    }
}
