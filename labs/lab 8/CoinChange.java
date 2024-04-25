import java.util.Arrays;

public class CoinChange
{
	public static int coinChange(int[] coins, int amount)
	{
		int maxAmount = amount + 1;
		int [] dynamic = new int[amount + 1];
		Arrays.fill(dynamic, maxAmount);
		dynamic[0] = 0;
		for (int i = 1; i <= amount; i++)
		{
			for (int j = 0; j < coins.length; j++)
			{
				if (coins[j] <= i)
				{
					dynamic[i] = Math.min(dynamic[i], 1 + dynamic[i-coins[j]]);
				}
			}
		}
		return dynamic[amount] > amount ? -1 : dynamic[amount];
	}
	public static void main(String args[])
	{
		int[] coins = new int[] {1,2,5};
		int amount = 11;
		CoinChange test = new CoinChange();
		System.out.println(coinChange(coins, amount));
	}
}
