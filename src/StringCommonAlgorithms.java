
public class StringCommonAlgorithms {
    public static void main(String [] args) {
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(findSmallestAndLargestSubString("welcometojava",3));

    }

    /**
     * Finds the smallest and largest substring of a given phrase
     * sorted alphabetically
     *
     * @param phrase
     * @param k
     * @return
     */
    private static String findSmallestAndLargestSubString(String phrase, int k) {

        String smallest = phrase.substring(0, k);
        String largest = phrase.substring(0, k);

        String temporarySubString = "";

        for (int i = 0; i < phrase.length() && i + k <= phrase.length() ; i++) {

                temporarySubString = phrase.substring(i, i + k);

                if (temporarySubString.length() == k) {

                    if (temporarySubString.compareTo(largest) >= 0) {
                        largest = temporarySubString;

                    } else if (temporarySubString.compareTo(smallest) <= 0) {
                        smallest = temporarySubString;
                    }
                }
        }

        return smallest + "\n" + largest;

    }
}
