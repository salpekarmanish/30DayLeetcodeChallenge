import java.util.*;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> result = new ArrayList<>();

        for (String word : words) {

           
            String[] parts = word.split("\\" + separator);

            for (String str : parts) {

                
                if (!str.isEmpty()) {
                    result.add(str);
                }
            }
        }

        return result;
    }
}