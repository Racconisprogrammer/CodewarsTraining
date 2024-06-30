package com.competitiverival;

public class EmailObfuscator {
    public static String Obfuscate(String email) {
        String newEmail = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                newEmail = newEmail + " [at] ";
            } else if (email.charAt(i) == '.') {
                newEmail = newEmail + " [dot] ";
            } else {
                newEmail = newEmail + email.charAt(i);
            }
        }
        return newEmail;
    }
}
