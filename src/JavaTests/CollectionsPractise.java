package JavaTests;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionsPractise {
    public static void main(String[] args) {
      //  groceryList();
       // favoriteNums();
       // uniqeWords();
       // studentGrades();
       wordFreq();
    }
    /**
     * Beginner (List)
     *
     * Shopping List Manager
     * Create an ArrayList<String> for grocery items.
     * Add items, remove one, and print the final list.
     * Goal: get comfortable with add(), remove(), get(), and iteration.
     */

    public static void groceryList(){
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("eggs");
        groceries.add("oats");
        groceries.add("chia");
        groceries.add("cucumber");
        groceries.add("tomato");
        System.out.println("All the grocery items are " + groceries);

        groceries.remove("tomato"); //or
      //  groceries.remove(3);

        System.out.println(" Grocery list is consist of " + groceries);
    }


    /** Favorite Numbers
     * Store 5 integers in an ArrayList<Integer>.
     * Print the numbers in reverse order.
     * Goal: practice working with indexes and iteration.
     */

    public static void favoriteNums(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(8);
        numbers.add(10);
        numbers.add(5);
        System.out.println("Nunbers are " + numbers);

        for(int i = numbers.size()-1; i>=0; i--){
            System.out.println(numbers.get(i));
        }
    }

/** Medium (Set + Map)
 *
 * Unique Words Collector (Set)
 * Input: {"apple", "banana", "apple", "orange", "banana"}.
 * Store the words in a HashSet<String>.
 * Print the unique words.
 * Goal:
 */

public static void uniqeWords() {
    Set<String> uniqes = new TreeSet<>();
    uniqes.add("test");
    uniqes.add("java");
    uniqes.add("pyton");
    uniqes.add("c#");
    uniqes.add("test");
    System.out.println(uniqes);

    for (String word : uniqes) {  //or this
        System.out.println(word);
    }

}
/** Student Grades (Map)
 * Use a HashMap<String, Integer> where key = student name, value = grade.
 * Add 3 students and their grades.
 * Print all students and grades.
 * Search for a specific student and print their grade.
 * Goal: get familiar with key-value lookups in Map.
 */

public static void studentGrades(){
 HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John", 5);
        studentGrades.put("Mary", 5);
        studentGrades.put("Tom",4);
    System.out.println(studentGrades);
   int grade= studentGrades.get("Tom");

    System.out.println("Tom's grade is " + grade);
    }

    /** Slightly Advanced (Combine List, Set, Map)
     *
     * Word Frequency Counter
     * Input: ["cat", "dog", "cat", "bird", "dog", "cat"].
     * Use a HashMap<String, Integer> to count how many times each word appears.
     * Print results: cat=3, dog=2, bird=1.
     * Bonus: also use a Set to print which words appeared at least once.
     * Goal: combine Map for counting + Set for uniqueness.
     */

    public static void wordFreq(){

        List<String> animals = Arrays.asList("cat", "dog", "cat", "bird", "dog", "cat");
        HashMap<String, Integer> animalsCount = new HashMap<>();
        for(String word : animals){
            animalsCount.put(word, animalsCount.getOrDefault(word, 0) );

            System.out.println(word);
            System.out.println(animalsCount);
        }

    }











}