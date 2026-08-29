from typing import List
from collections import defaultdict

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # 1. Frequency map
        freq = defaultdict(int)
        for num in nums:
            freq[num] += 1

        # 2. Buckets: index = frequency
        buckets = [[] for _ in range(len(nums) + 1)]
        for num, count in freq.items():
            buckets[count].append(num)

        # 3. Gather top k from highest frequency
        res = []
        for f in range(len(buckets) - 1, 0, -1):
            for num in buckets[f]:
                res.append(num)
                if len(res) == k:
                    return res