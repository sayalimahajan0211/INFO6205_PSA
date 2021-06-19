# INFO6205 [![CircleCI](https://circleci.com/gh/rchillyard/INFO6205_Solutions.svg?style=svg&circle-token=e04e620a015b2df70efde4d506ee6ac96531377c)](https://circleci.com/gh/rchillyard/INFO6205_Solutions)
This is the class repository for Program Structure and Algorithms


There are two parts to this assignment.

Part 1

If you haven't already, code the quadratic solution of 3-SUM, i.e.

ThreeSumQuadratic

In the repository. Show that the unit tests all pass. And show a graph of your observations (use the Benchmark code) for at least five different (doubling) values of N. If the growth is not O(N^2), please explain why.

Points: 25

Part 2

We mentioned two alternatives for implementing Union-Find:

For weighted quick union, store the depth rather than the size;

For weighted quick union with path compression, do two loops, so that all intermediate nodes point to the root, not just the alternates.
For both of these, code the alternative and benchmark it against the implementation in the repository. You have all of that available from a previous assignment.

If you can explain why alternative #1 is unnecessary to be benchmarked, you may skip benchmarking that one.

Points: 35

Usual submission rules apply.
