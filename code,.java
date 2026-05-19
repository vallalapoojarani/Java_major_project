import java.util.Scanner;
public class TextEncoderDecoder {

    // Method to encode a message using a Caesar cipher
    public static String encode(String message, int shift) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Wrap around logic for uppercase
                char ch = (char) (((c - 'A' + shift) % 26 + 26) % 26 + 'A');
                encoded.append(ch);
            } else if (Character.isLowerCase(c)) {
                // Wrap around logic for lowercase
                char ch = (char) (((c - 'a' + shift) % 26 + 26) % 26 + 'a');
                encoded.append(ch);
            } else {
                // Keep non-alphabetic characters unchanged
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    // Method to decode by reversing the shift
    public static String decode(String message, int shift) {
        return encode(message, 26 - (shift % 26));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Encode a message");
            System.out.println("2. Decode a message");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter message to encode: ");
                    String encodeMsg = scanner.nextLine();
                    System.out.print("Enter shift: ");
                    int encodeShift = scanner.nextInt();
                    System.out.println("Encoded Message: " + encode(encodeMsg, encodeShift));
                    break;

                case 2:
                    System.out.print("Enter message to decode: ");
                    String decodeMsg = scanner.nextLine();
                    System.out.print("Enter shift: ");
                    int decodeShift = scanner.nextInt();
                    System.out.println("Decoded Message: " + decode(decodeMsg, decodeShift));
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
