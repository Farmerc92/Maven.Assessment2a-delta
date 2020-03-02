package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if (startingIndex < 0 || endingIndex < 0){
            throw new IllegalArgumentException("indexes must be positive");
        }
        String[] results = new String[endingIndex - startingIndex];
        int j = 0;
        for (int i = startingIndex; i < endingIndex; i++) {
            results[j] = arrayToBeSpliced[i];
            j++;
        }
        return results;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if (startingIndex > arrayToBeSpliced.length){
            throw new IllegalArgumentException("index greater than length of string");
        }
        else if (startingIndex < 0){
            throw new IndexOutOfBoundsException("starting index must be positive");
        }
        int stringLength = arrayToBeSpliced.length - startingIndex;
        String[] results = new String[stringLength];
        int indexCounter = 0;
        for (int i = 0; i < arrayToBeSpliced.length; i++) {
            if(startingIndex == i){
                results[indexCounter++] = arrayToBeSpliced[i];
                startingIndex++;
            }
        }
        return results;
    }
}
