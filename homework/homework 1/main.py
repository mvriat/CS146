import re


def is_palindrome(s):
    s = s.lower()
    s = re.sub(r'[^A-Za-z0-9]', '', s)
    normal = list(s)
    backwards = normal[::-1]
    return normal == backwards


if __name__ == "__main__":
    test1 = "Racecar"
    print(is_palindrome(test1))
