In this lab, we use the Floyd-Warshall Algorithm.
First we created the 2D array which we can fill. We first filled the diagonal with 0 since there is no path from a node to the same node.
After this we can use the input array to fill ours. It is undirected.
Now we implement the Floyd-Warshall Algorithm to find the shortest paths between the cities.
Next, it's going t iterate throught the cities and keep count of cities we can get to using the threshold. Using this, it saves which city has the minimun count of reachable cities and returns it.
