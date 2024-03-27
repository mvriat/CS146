from collections import deque


def canFinish(numCourses, prerequisites):
    if len(prerequisites) == 0:
        return True
    if numCourses < 0 or numCourses > 2000:
        return False
    edgeList = [[] for _ in range(numCourses)]
    frequencies = [0] * numCourses
    count = 0
    for prereq in prerequisites:
        edgeList[prereq[0]].append(prereq[1])
        frequencies[prereq[1]] += 1
    queue = deque()
    for i in range(len(edgeList)):
        if frequencies[i] == 0:
            queue.append(i)
            count += 1
    while queue:
        i = queue.popleft()
        for j in edgeList[i]:
            frequencies[j] -= 1
            if frequencies[j] == 0:
                count += 1
                queue.append(j)
    return count == numCourses


numCourses = 2
prereq = [[1,0],[0,1]]
print(canFinish(numCourses, prereq))

