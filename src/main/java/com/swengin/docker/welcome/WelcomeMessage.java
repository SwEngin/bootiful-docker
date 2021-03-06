package com.swengin.docker.welcome;

import java.util.Objects;

public class WelcomeMessage {

    private String message;

    public WelcomeMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WelcomeMessage that = (WelcomeMessage) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "WelcomeMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
