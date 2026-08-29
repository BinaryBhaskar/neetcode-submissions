class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen_pair = dict()

        for i, num in enumerate(nums):
            if str(num) not in seen_pair.keys():
                seen_pair[str(target - num)] = i
            else:
                return [seen_pair[str(num)], i]
