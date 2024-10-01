class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottlesDrunk = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {
            totalBottlesDrunk += numBottles;
            emptyBottles += numBottles;

            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }

        return totalBottlesDrunk;
    }
}