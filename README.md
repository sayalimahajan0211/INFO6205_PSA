# INFO6205 [![CircleCI](https://circleci.com/gh/rchillyard/INFO6205_Solutions.svg?style=svg&circle-token=e04e620a015b2df70efde4d506ee6ac96531377c)](https://circleci.com/gh/rchillyard/INFO6205_Solutions)
This is the class repository for Program Structure and Algorithms


This assignment will begin to build your algorithmic skills. It will also give you some experience with random number generation in Java.

An important example of a practical experiment is called the "random walk" experiment.

Imagine a drunken man who, starting out leaning against a lamp post in the middle of an open space, takes a series of steps of the same length: 1 meter. The direction of these steps is randomly chosen from North, South, East or West. After n steps, how far (d), generally speaking, is the man from the lamp post? Note that d is the Euclidean distance of the man from the lamp-post.

It turns out that there is a relationship between d and n which is typically applicable to many different types of stochastic (randomized) experiments. Your task is to implement the code for the experiment and, most importantly, to deduce the relationship.

Please clone/pull from the class repository and work on RandomWalk.java and RandomWalkTest.java each of package randomwalk and each under the appropriate source directory. [You may have to remove other java files from the classpath in order to allow the whole project to compile. In IntelliJ/IDEA you can do this for entire packages by right-clicking and choosing "Mark Directory As... Excluded"]. Once you have all the unit tests running, you can do the experiment by running RandomWalk as a main program (provide the value of n as the first argument).

For this particular assignment, it is necessary but not sufficient to ensure that the unit tests all run. You must demonstrate via image files, graphs, whatever, what experiments you made in order to come up with the required expression. You will run the experiment for at least six values of n and will run each of these at least ten times. That's to say, you will run the program at least 60 separate times. Feel free to change the main program so that it will run all your experiments in one shot instead of 60 different runs.

Your submission should include:

1. Your conclusion about the relationship between d and n;
2. Your evidence to support that relationship (screen shot and/or graph and/or spreadsheet);
3. Your code (RandomWalk.java plus anything else that you changed or created);
4. A screen shot of the unit tests all passing.
