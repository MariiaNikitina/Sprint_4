package com.ya;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name != null &&
                !name.startsWith(" ") && !name.endsWith(" ") &&
                name.length() - name.replaceAll(" ", "").length() == 1 &&
                name.length() >= 3 && name.length() <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
