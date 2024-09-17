class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        ls1 = list(map(str, s1.split(" ")))
        ls2 = list(map(str, s2.split(" ")))
        ans = []
        for i in ls1:
            if(ls1.count(i) == 1 and i not in ls2):
                ans.append(i)
        for j in ls2:
            if(ls2.count(j) == 1 and j not in ls1):
                ans.append(j)

        return ans