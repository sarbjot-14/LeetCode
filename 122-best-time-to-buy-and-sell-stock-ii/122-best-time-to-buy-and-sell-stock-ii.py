class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        curr_profit = 0
        curr_min = prices[0]
        curr_max = prices[0]
        for index, price in enumerate(prices):
            curr_min = min(price,curr_min)
            curr_max = max(price, curr_max)
            curr_profit = curr_max - curr_min
            try:
                print(price)
                if prices[index+1] < curr_max:
                    print(max_profit)
                    max_profit += curr_profit
                    curr_min = prices[index+1]
                    curr_max = 0
                    curr_profit = 0
            except:
                print("no problem")
            print(f"price: {price} index: {index}, curr_min: {curr_min}, curr_max: {curr_max}")
        max_profit += curr_profit
        return max_profit
        