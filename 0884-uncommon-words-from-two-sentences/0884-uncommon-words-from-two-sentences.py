class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        return [unique for unique, count in Counter(s1.split(" ") + s2.split(" ")).items() if(count == 1)]