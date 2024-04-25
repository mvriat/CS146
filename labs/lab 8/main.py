import sys


def coin_change(coins, amount):
    max_amount = amount + 1
    dynamic = [max_amount] * (amount + 1)
    dynamic[0] = 0
    for i in range(1, amount + 1):
        for coin in coins:
            if coin <= i:
                dynamic[i] = min(dynamic[i], 1 + dynamic[i - coin])
    return dynamic[amount] if dynamic[amount] <= amount else -1


if __name__ == "__main__":
    coins = [1, 2, 5]
    amount = 11
    print(coin_change(coins, amount))

