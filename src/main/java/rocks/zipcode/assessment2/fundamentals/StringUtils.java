package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%"+amountOfPadding+"s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-"+amountOfPadding+"s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String results = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            results += stringToBeRepeated;
        }
        return results;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 32){
                continue;
            }
            if (string.charAt(i) < 65 || string.charAt(i) > 122){
                return false;
            }
            else if (string.charAt(i) > 90 && string.charAt(i) < 97){
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 57 || string.charAt(i) < 48){
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        if (isNumericString(string) || isAlphaString(string)){
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 47 && string.charAt(i) < 58){
                return false;
            }
            else if (string.charAt(i) >64 && string.charAt(i) <91){
                return false;
            }
            else if (string.charAt(i) > 96 && string.charAt(i) < 123){
                return false;
            }
        }
        return true;
    }
}
