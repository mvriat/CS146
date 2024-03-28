For this lab, it is going to represent Khan's algorithm. I had this on my interview question and failed miserably cuz I didn't have this solified in my head smh
First I checked some of the constraints. Pretty easy, if you don't have any classes then of course you canFinish();
Then we make the edge list to keep track of the indegrees. Then I made an array frequencies the length of how many courses we need to take. Then a counter.
For every array in prerequisites, if the edgeList at the first prerequisites array is null. then make that a new array list. Then at edgelist[prereq[0]] we will add the value of prereq[1]. Now increment frequencies[prereq[1]].
Now the fun stuff! Here we will use a queue. For every i in edgeList, if the frequencies[i] is 0 (the indegree is 0, no prereqs for this course), then we offer i to the queue(kind of like add) and count++.
While this queue isn't empty, we're going to decrement the indegrees just like in Kahns. Remvoe the course and increment the count for the num of courses we have taken. This repeats until the queue is empty. Return whether that count is equal to the actualy numCourses we have to take.
