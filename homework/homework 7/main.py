from typing import List

class Servers:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        if len(intervals) <= 0:
            return 0
        start = [0] * len(intervals)
        end = [0] * len(intervals)
        for i in range(len(intervals)):
            start[i] = intervals[i][0]
            end[i] = intervals[i][1]
        start.sort()
        end.sort()
        servers = 0
        itr = 0
        for i in range(len(start)):
            if start[i] < end[itr]:
                servers += 1
            else:
                itr += 1
        return servers

#test
intervals = [[0, 1], [1, 2], [2, 3]]
server = Servers()
print(server.minMeetingRooms(intervals))
