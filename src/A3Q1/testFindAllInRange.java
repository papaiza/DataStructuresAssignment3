package A3Q1;
import java.util.*;

/**
 * Tests BSTRange
 * 
 * @author jameselder
 */
public class testFindAllInRange {

    public static void main(String[] args) {
        BSTRange<Integer, String> medals = new BSTRange<Integer, String>();
        PositionalList<Entry<Integer, String>> medalList;
        Iterator<Entry<Integer, String>> entryIter;
        int k1 = 3;
        int k2 = 7;

        try { //should output nothing
            medalList = medals.findAllInRange(k1, k2);
            entryIter = medalList.iterator();

            System.out.println("The countries ranked from " + k1 + " to " + k2 + " in medal standings are:");
            while (entryIter.hasNext()) {
                System.out.println(entryIter.next().getValue());
            }
        } catch (Exception x) {
            System.out.println("Test Case 1 Failed");
        }

        medals.put(2, "Germany");
        medals.put(8, "China");
        medals.put(3, "Canada");
        medals.put(9, "Sweden");
        medals.put(4, "Norway");
        medals.put(10, "France");
        medals.put(1, "USA");
        medals.put(5, "Austria");
        medals.put(6, "Russian Federation");
        medals.put(7, "Korea");

        try { //should output USA, Germany, Canada, Norway, Austria, Russian Federation, Korea
            medalList = medals.findAllInRange(k1, k2);
            entryIter = medalList.iterator();

            System.out.println("The countries ranked from " + k1 + " to " + k2 + " in medal standings are:");
            while (entryIter.hasNext()) {
                System.out.println(entryIter.next().getValue());
            }
        } catch (Exception x) {
            System.out.println("Test Case 2 Failed");
        }

       k1 = -10;
       k2 = -5;
        try { //should output nothing
            medalList = medals.findAllInRange(k1, k2);
            entryIter = medalList.iterator();

            System.out.println("The countries ranked from " + k1 + " to " + k2 + " in medal standings are:");
            while (entryIter.hasNext()) {
                System.out.println(entryIter.next().getValue());
            }
        } catch (Exception x) {
            System.out.println("Test Case 3 Failed");
        }

       k1 = 5;
       k2 = 4;
       try { //should output nothing
            medalList = medals.findAllInRange(k1, k2);
            entryIter = medalList.iterator();

            System.out.println("The countries ranked from " + k1 + " to " + k2 + " in medal standings are:");
            while (entryIter.hasNext()) {
                System.out.println(entryIter.next().getValue());
            }
        } catch (Exception x) {
            System.out.println("Test Case 4 Failed");
        }

       k1 = 3;
       k2 = 3;
       try {//should output Canada
            medalList = medals.findAllInRange(k1, k2);
            entryIter = medalList.iterator();

            System.out.println("The countries ranked from " + k1 + " to " + k2 + " in medal standings are:");
            while (entryIter.hasNext()) {
                System.out.println(entryIter.next().getValue());
            }
        } catch (Exception x) {
            System.out.println("Test Case 5 Failed");
        }

       k1 = -10;
       k2 = 10;
       try {//should output USA, Germany, Canada, Norway, Austria, Russian Federation, Korea, China, Norway, France
            medalList = medals.findAllInRange(k1, k2);
            entryIter = medalList.iterator();

            System.out.println("The countries ranked from " + k1 + " to " + k2 + " in medal standings are:");
            while (entryIter.hasNext()) {
                System.out.println(entryIter.next().getValue());
            }
        } catch (Exception x) {
            System.out.println("Test Case 6 Failed");
        }

    }
}