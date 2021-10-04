public class PartB {

    public static void main(String[] args){
        printDetails(args[0]);
    }

    public static void printDetails(String input){
        for (char c : input.toCharArray()){
            if (isWhitespace(c)){
                System.out.println(getCharString(c) + " : whitespace");
            }

            else if (isPunctuation(c)) {
                System.out.println(getCharString(c) + " : punctuation");
            }

            else if (isExtendedChar(c)) {
                System.out.println(getCharString(c) + " : extended character");
            }

            else if (isNumeric(c)) {
                System.out.println(getCharString(c) + " : numeric");
            }

            else if (isLowercase(c)){
                System.out.println(getCharString(c) + " : lowercase");
            }

            else if (isUppercase(c)){
                System.out.println(getCharString(c) + " : uppercase");
            }
            else {
                System.out.println("unprintable");
            }
        }
    }

    public static String getCharString(char c){
        return '"' + Character.toString(c) + '"';
    }

    public static boolean isWhitespace(char c){
        return (c < 14 && c > 9) || c == 32;
    }

    public static boolean isPunctuation(char c){
        if (c > 32 && c < 48){
            return true;
        }

        else if (c > 57 && c < 65){
            return true;
        }

        else if (c > 90 && c < 97){
            return true;
        }

        return c > 122 && c < 127;
    }

    public static boolean isExtendedChar(char c){
        return c > 127;
    }

    public static boolean isUppercase(char c){
        return c > 64 && c < 91;
    }

    public static boolean isLowercase(char c){
        return c > 96 && c < 123;
    }

    public static boolean isNumeric(char c){
        return c > 48 && c < 58;
    }
}
