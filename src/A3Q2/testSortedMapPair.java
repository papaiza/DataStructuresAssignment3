package A3Q2;

/**
 * Tests SortedMapPair.
 * @author jameselder
 */
public class testSortedMapPair {

    public static void main(String[] args) {
    	Integer[] a1 = {1, 3, 5, 7, 9, 11};
        Integer[] a2 = {2, 4, 6, 8, 10};
        Integer k;
        Integer kth;
        SortedMapPair<Integer> myMapPair;

        try {
            myMapPair = new SortedMapPair<>(a1, a2);
            k=5;
            try { //should output 7
                kth = myMapPair.kthSmallestOfUnion(k);
                System.out.println("The " + k +
                        "th smallest integer in the two arrays is " + kth);
            } catch (RankOutOfRangeException roorx) {
                System.out.println("Rank out of range");
            }

            k=8;
            try {  //should output 8
                kth = myMapPair.kthSmallestOfUnion(k);
                System.out.println("The " + k +
                        "th smallest integer in the two arrays is " + kth);
            } catch (RankOutOfRangeException roorx) {
                System.out.println("Rank out of range");
            }

            k=10;
            try {  //should output 10
                kth = myMapPair.kthSmallestOfUnion(k);
                System.out.println("The " + k +
                        "th smallest integer in the two arrays is " + kth);
            } catch (RankOutOfRangeException roorx) {
                System.out.println("Rank out of range");
            }

            k= 0;
            try {  //should throw exception
                kth = myMapPair.kthSmallestOfUnion(k);
                System.out.println("The " + k +
                        "th smallest integer in the two arrays is " + kth);
            } catch (RankOutOfRangeException roorx) {
                System.out.println("Rank out of range");
            }
        } catch (Exception ex) {
            System.out.println("Unexpected exception");
        }
    }
}