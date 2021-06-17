package edu.neu.coe.info6205.threesum;

import edu.neu.coe.info6205.union_find.WQUPC;
import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;

import java.util.*;

/**
 * Implementation of ThreeSum which follows the approach of dividing the solution-space into
 * N sub-spaces where each sub-space corresponds to a fixed value for the middle index of the three values.
 * Each sub-space is then solved by expanding the scope of the other two indices outwards from the starting point.
 * Since each sub-space can be solved in O(N) time, the overall complexity is O(N^2).
 * <p>
 * The array provided in the constructor MUST be ordered.
 */
public class ThreeSumQuadratic implements ThreeSum {
    /**
     * Construct a ThreeSumQuadratic on a.
     * @param a a sorted array.
     */
    public ThreeSumQuadratic(int[] a) {
        this.a = a;
        length = a.length;
    }

    public Triple[] getTriples() {
        List<Triple> triples = new ArrayList<>();
        for (int i = 0; i < length; i++)
            triples.addAll(getTriples(i));
        Collections.sort(triples);
        return triples.stream().distinct().toArray(Triple[]::new);
    }

    /**
     * Get a list of Triples such that the middle index is the given value j.
     *
     * @param j the index of the middle value.
     * @return a Triple such that
     */
    public List<Triple> getTriples(int j) {
        List<Triple> triples = new ArrayList<>();
        // TO BE IMPLEMENTED : implement getTriples
        Arrays.sort(a); //sort array first
        for (int i = 0; i < length; i++) { //i will be the first index of triples
            int start = i + 1; // start will the middle value of triples
            int end = length - 1; //end will be the last values of triples
            while (start < end) { //check for array finish
                if (a[i] + a[start] + a[end] == 0 && ( start==j )) { //checking condition to get sum equal to 0 and j is middle index of triples i.e start variable
                    triples.add(new Triple(a[i], a[start], a[end])); //add triples to result array
                    start++;
                    end--;
                } else if (a[i] + a[start] + a[end] < 0) { //check for non zero value and move forward
                    start++;
                } else {
                    end--;
                }
            }
        }
        return triples;
    }

    private final int[] a;
    private final int length;

    //benchmarking for three_sum_quadratic problem - O(n^2)
    public static void main(String args[])
    {
        for(int i=25;i<=64000;i=i*2) {
            int sites = i;
            //benchmarking for random sorted array
            Benchmark benchmark_threesum = new Benchmark_Timer<>("", b -> {
                Random random1 = new Random();
                int[] intArray=new int[sites];
                for(int z=0;z<sites;z++)
                {
                    intArray[z]=random1.nextInt(sites);
                }
                ThreeSumQuadratic threeSumQuadratic = new ThreeSumQuadratic(intArray);
                threeSumQuadratic.getTriples();

            });
            double result = benchmark_threesum.run(0, 10);
            System.out.println("three sum quaratic for " + sites + " array length takes " + result + " milliseconds.");
        }
    }

}
