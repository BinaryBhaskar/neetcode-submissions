class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        seen = dict()

        for i in strs:
            freq = [0] * 26
            for l in i:
                freq[ord(l) - ord('a')] += 1

            key = tuple(freq)

            if key in seen.keys():
                seen[key].append(i)
            else:
                seen[key] = list()
                seen[key].append(i)

        return [[k for k in seen[j]] for j in seen.keys()]