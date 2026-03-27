package LAB_5;
// User-defined exception
class NotHexadecimalException extends Exception {
    public NotHexadecimalException(String number) {
        super("\"" + number + "\" is NOT a valid hexadecimal number.");
    }
}

public class HexValidator {

    static void checkHex(String number) throws NotHexadecimalException {
        String hexChars = "0123456789abcdefABCDEF";
        for (char c : number.toCharArray()) {
            if (hexChars.indexOf(c) == -1) {
                throw new NotHexadecimalException(number);
            }
        }
    }

    public static void main(String[] args) {
        // Numbers assigned to String variables (as required)
        String num1 = "1A3F";      // valid hex
        String num2 = "G2H5";      // not valid hex
        String num3 = "0xFF";      // not valid (has 'x')
        String num4 = "DEADBEEF";  // valid hex

        String[] numbers = {num1, num2, num3, num4};

        for (String number : numbers) {
            try {
                checkHex(number);
                System.out.println("\"" + number + "\" IS a valid hexadecimal number.");
            } catch (NotHexadecimalException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                // This always prints regardless of hex validity
                System.out.println("Ending the program check for: " + number);
                System.out.println();
            }
        }
    }
}