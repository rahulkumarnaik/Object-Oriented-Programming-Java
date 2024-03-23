import java.util.*;
import java.util.stream.Stream;

public class arraylist { // Class name starts with uppercase

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

      //  ArrayList<Integer> list = Arrays.asList(0,2,3); -- another way to insert values into the array list

        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list); // Output: [0, 2, 3]

        // Get element
        int element = list.get(0);
        System.out.println(element); // Output: 0

        // Add element in between
        list.add(1, 1);
        System.out.println(list); // Output: [0, 1, 2, 3]

        // Set element
        list.set(0, 5);
        System.out.println(list); // Output: [5, 1, 2, 3]

        // Delete element
        list.remove(3);
        System.out.println(list); // Output: [5, 1, 2]

        // Size
        int size = list.size();
        System.out.println(size); // Output: 3

        // Loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // Output: 5 1 2

        // Sorting
        Collections.sort(list);
        System.out.println(list); // Output: [1, 2, 5]


       
        Stream<Integer>s1=list.stream();
        Stream<Integer>s2=s1.filter(n->n%2==0);
        Stream<Integer>s3=s2.map(n->n*2);

        // Iterate over the elements using forEach and lambda expression
        list.forEach(n -> System.out.println(n));
    }
}
