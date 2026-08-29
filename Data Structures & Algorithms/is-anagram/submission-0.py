class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        seen_s = dict()
        seen_t = dict()

        if len(s) != len(t):
            return False
        
        for ls in s:
            if ls in seen_s.keys():
                seen_s[ls] += 1
            else:
                seen_s[ls] = 1
        
        for lt in t:
            if lt in seen_t.keys():
                seen_t[lt] += 1
            else:
                seen_t[lt] = 1

        for l in seen_s:
            if l not in seen_t:
                return False
            if seen_s[l] != seen_t[l]:
                return False
        return True