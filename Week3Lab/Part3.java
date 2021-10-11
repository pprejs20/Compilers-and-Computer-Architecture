import java.util.Scanner;

public class PartB {

    public static boolean isAcceptedInput(String input){

        // If the input is more than 1 character, the first char should be 1
        if (input.length() > 1) {
            if (input.charAt(0) != '1') {
                return false;
            }
        }

        // If the input is 1 character, check if it is an accepted character
        else {
            return isAcceptedChar(input.charAt(0));
        }

        // Iterate over the string checking if each character is accepted
        for (char c : input.toCharArray()){
            if (!isAcceptedChar(c)){
                return false;
            }
        }

        return true;

    }

    public static boolean isAcceptedChar(char a){
        return a == '0' || a == '1';
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (isAcceptedInput(input)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

}
