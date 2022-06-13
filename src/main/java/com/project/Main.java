package com.project;

public class Main {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("Hello"));
        System.out.println(removeDuplicates("Kevin"));
        System.out.println(removeDuplicates("Procrastinate"));

    }

    // A method that removes all instances of any character that appears more than once in a String.
    public static String removeDuplicates(String string) {

        StringBuilder duplicateChars = new StringBuilder();

        for (int x = 0; x < string.length(); x++) {

            for (int y = x + 1; y < string.length(); y++) {

                if (string.charAt(x) == string.charAt(y)) {
                    if (!duplicateChars.toString().contains(Character.toString(string.charAt(x)))) { duplicateChars.append(string.charAt(x)); }
                    break;
                }

            }

        }

        StringBuilder newString = new StringBuilder(string);

        for (int x = 0; x < newString.length(); x++) {

            if (duplicateChars.toString().contains(Character.toString(newString.charAt(x)))) {
                newString.deleteCharAt(x);
                x--;
            }

        }

        return newString.toString();

    }

}
