import java.util.Scanner;

public class PhoneticEncoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int N = scan.nextInt();

        String[] phoneticArray = new String[N];

        for (int i = 0; i < phoneticArray.length; i++) {
            phoneticArray[i] = scan.next();
        }

        for (int i = 0; i < phoneticArray.length; i++) {
            String alphabet;

            switch (phoneticArray[i]) {
                case "Alfa":
                    alphabet = "A";
                    break;

                case "Bravo":
                    alphabet = "B";
                    break;

                case "Charlie":
                    alphabet = "C";
                    break;

                case "Delta":
                    alphabet = "D";
                    break;

                case "Echo":
                    alphabet = "E";
                    break;

                case "Foxtrot":
                    alphabet = "F";
                    break;

                case "Golf":
                    alphabet = "G";
                    break;

                case "Hotel":
                    alphabet = "H";
                    break;

                case "India":
                    alphabet = "I";
                    break;

                case "Juliett":
                    alphabet = "J";
                    break;

                case "Kilo":
                    alphabet = "K";
                    break;

                case "Lima":
                    alphabet = "L";
                    break;

                case "Mike":
                    alphabet = "M";
                    break;

                case "November":
                    alphabet = "N";
                    break;

                case "Oscar":
                    alphabet = "O";
                    break;

                case "Papa":
                    alphabet = "P";
                    break;

                case "Quebec":
                    alphabet = "Q";
                    break;

                case "Romeo":
                    alphabet = "R";
                    break;

                case "Sierra":
                    alphabet = "S";
                    break;

                case "Tango":
                    alphabet = "T";
                    break;

                case "Uniform":
                    alphabet = "U";
                    break;

                case "Victor":
                    alphabet = "V";
                    break;

                case "Whiskey":
                    alphabet = "W";
                    break;

                case "X-ray":
                    alphabet = "X";
                    break;

                case "Yankee":
                    alphabet = "Y";
                    break;

                case "Zulu":
                    alphabet = "Z";
                    break;

                default:
                    alphabet = "";
                    break;
            }
            System.out.printf("%s", alphabet);
        }

        scan.close();
    }
}
