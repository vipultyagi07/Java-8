package A_functionalInterface.A_predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class A2_Predicate {
    public static void main(String[] args) {
        // Initialize a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("alderberry");

        // Define a Predicate to filter strings that start with the letter 'a'
        Predicate<String> stringPredicate = str -> str.startsWith("a");

        // Call the filterStrings method to filter the strings
        List<String> filteredStrings = filterStrings(strings, stringPredicate);

        // 'filteredStrings' now contains only the strings that satisfy the predicate.
        System.out.println("Filtered Strings:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    public static List<String> filterStrings(List<String> inputList, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String str : inputList) {
            if (predicate.test(str)) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }
}