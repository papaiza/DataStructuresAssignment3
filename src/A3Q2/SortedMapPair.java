package A3Q2;

import java.util.Arrays;

/**
 * Stores a pair of sorted arrays. The arrays are assumed to be disjoint, i.e.,
 * none of the elements are repeated, either within or between the arrays.
 * Elements within each array are strictly increasing in value. A method is
 * provided to find the kth smallest value in the union of the two arrays, in
 * O(log k) time.
 * 
 * @author Anton Sitkovets
 */
public class SortedMapPair<E extends Comparable<E>>
{
	E[] A1, A2;

	/* Note that the constructor assumes the arrays to be pre-sorted. */
	public SortedMapPair(E[] array1, E[] array2) throws NullPointerException
	{
		if (array1 == null || array2 == null)
		{
			throw new NullPointerException();
		}
		A1 = array1;
		A2 = array2;
	}

	/**
	 * Returns the kth smallest value in the union of the two arrays, in O(log
	 * k) time. An exception is thrown if k is not positive, or if it is more
	 * than sum of the lengths of the arrays.
	 * 
	 * @param k
	 * @return
	 * @throws RankOutOfRangeException
	 */
	public E kthSmallestOfUnion(int k) throws RankOutOfRangeException
	{

		if (k < 1 || k > this.A1.length + this.A2.length){
			throw new RankOutOfRangeException("Rank out of range");
		}
		if (k == 1){
			if (A1[0].compareTo(A2[0]) > 0){
				return A2[0];
			} else{
				return A1[0];
			}
		}
		this.A1 = Arrays.copyOf(this.A1, k);
		this.A2 = Arrays.copyOf(this.A2, k);

		if (A1.length == 0 && A2.length != 0){
			return A2[k - 1];
		} else if (A1.length != 0 && A2.length == 0){
			return A1[k - 1];
		}

		int i, j, step;
		
		if ((k % 2) != 0){
			i = k / 2 + 1;
			j = k - i;
			step = k / 4;
		}else{
			i = k / 2;
			j = k - i;
			step = k / 4;
		}

		while (k == i + j + 1){
			if (A1[i - 1].compareTo(A2[j - 1]) >= 0){
				i = step - i;
				j = j + step;
			}else{
				i = i + step;
				j = j - step;
			}
			step = step / 2;

			if (step == 0){
				step = 1;
			}
		}
		
		if (A1[i - 1].compareTo(A2[j - 1]) > 0){
			return A1[i - 1];
		} else{
			return A2[j - 1];
		}

	}
}