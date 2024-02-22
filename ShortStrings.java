import tester.*;

public class ShortStrings {
    String[] shortStrings(String[] arr, int n) {
        int len = 0;
        for (String s : arr) {
            if (s.length() <= n) {
                len++;
            }
        }

        String[] output = new String[len];
        int index = 0;                                // remember to do this, because otherwise we are going to possible end up out of bound
        for (int i = 0; i < arr.length; i++) {        // we want to only incremend the index when there is a string <= n :D 
            if (arr[i].length() <= n) {
                output[index++] = arr[i];
            }
        }
        return output;
    }

    String[] s1 = {};
    String[] s2 = {"hi", "hii", "hiii", "hiiii", "hiiiii"};
    String[] s3 = {"apple", "kiwi", "watermelon", "banana", "grape"};
    String[] s4 = {"ball"};

    void testShortStrings(Tester t) {
        t.checkExpect(shortStrings(s1, 3), new String[]{});
        t.checkExpect(shortStrings(s2, 4), new String[]{"hi", "hii", "hiii"});
        t.checkExpect(shortStrings(s3, 5), new String[]{"apple", "kiwi", "grape"});
        t.checkExpect(shortStrings(s4, 3), new String[]{});
    }
}
