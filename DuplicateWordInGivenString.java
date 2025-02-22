import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordInGivenString {

    public static void main(String[] args) {


        String string = "A Big black bug bit a big black dog on his big black nose.";

        //convert String into lower case and split the string into words using built in function
        String[] words = string.toLowerCase().split(" ");

        //optimized Approach using Stream api
        // count occurrences using Stream api
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        //print duplicate words
        System.out.println("duplicate words and their count");
        wordCount.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

        //traditional approach
//        int count;
//
//        //convert String into lower case and split the string into words using built in function
//        String[] words = string.toLowerCase().split(" ");
//
//        System.out.println("Duplicate ords in a given string: ");
//        for(int i =0; i < words.length; i++){
//
//            count = 1;
//            for (int j = i+1; j< words.length; j++){
//                if(words[i].equals(words[j])){
//                    count ++;
//                    //set word[j] to 0
//                    words[j] = "0";
//                }
//            }
//            // display the duplicate duplicate word if count is greater than 1
//            if(count >  1 && words[i] != "0")
//                System.out.println(words[i]);
//        }


    }
}
