def fibonacci(n):
    x = 0
    y = 1
    for i in range(n):
        temp = x
        x = x + y
        y = temp
    return x



if __name__ == '__main__':
    print(fibonacci(8))