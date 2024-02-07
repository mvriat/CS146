from collections import Counter


def anagram_finder(s, t):
    return Counter(s) == Counter(t)


if __name__ == "__main__":
    a = "fgerg"
    b = "fsred"
    print(anagram_finder(a, b))
