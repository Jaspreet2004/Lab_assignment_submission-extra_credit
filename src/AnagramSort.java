import java.util.*;

public class AnagramSort {
    public static List<String> sortAnagrams(String[] words) {
        Map<String, List<String>> anagramDict = new HashMap<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            anagramDict.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        List<String> result = new ArrayList<>();
        for (List<String> anagrams : anagramDict.values()) {
            result.addAll(anagrams);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> sortedAnagrams = sortAnagrams(words);
        System.out.println(sortedAnagrams);
    }
}

//Time Complexity:
//Space Complexity:
