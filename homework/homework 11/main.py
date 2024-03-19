class Flood:
    def floodFill(self, image, sr, sc, color):
        if image is None or len(image) == 0 or len(image[0]) == 0 or sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]):
            return image
        if image[sr][sc] == color:
            return image
        self.floodFillHelper(image, sr, sc, image[sr][sc], color)
        return image

    def floodFillHelper(self, image, row, column, color, newColor):
        if row < 0 or column < 0 or row >= len(image) or column >= len(image[0]) or image[row][column] != color:
            return
        image[row][column] = newColor
        directionals = [[1, 0], [-1, 0], [0, 1], [0, -1]]
        for directions in directionals:
            self.floodFillHelper(image, row + directions[0], column + directions[1], color, newColor)

    def toString(self, arr):
        for i in range(len(arr)):
            print(arr[i])


test = Flood()
img = [
    [2, 2, 2],
    [2, 2, 0],
    [2, 0, 2]
]
sr = 1
sc = 1
newColor = 8
answer = test.floodFill(img, sr, sc, newColor)
test.toString(answer)

