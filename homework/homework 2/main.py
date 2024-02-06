def is_bad_version(version):
    return version in [3, 4, 5, 6]


def first_bad_version(n):
    first_version = 1
    last_version = n
    while first_version < last_version:
        middle = first_version + (last_version - first_version) // 2
        if is_bad_version(middle):
            last_version = middle
        else:
            first_version = middle + 1
    return first_version


if __name__ == "__main__":
    print(first_bad_version(10))
