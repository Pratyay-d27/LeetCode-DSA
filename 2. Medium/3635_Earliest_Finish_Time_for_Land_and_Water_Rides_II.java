//Same code as part 1 -- LeetCode 3633.
//Time Complexity - O(n) -- Linear Time
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        // Step 1: Find the earliest completion times for individual first rides
        int minLand = Integer.MAX_VALUE;
        for (int i = 0; i < landDuration.length; i++) {
            minLand = Math.min(minLand, landStartTime[i] + landDuration[i]);
        }

        int minWater = Integer.MAX_VALUE;
        for (int i = 0; i < waterDuration.length; i++) {
            minWater = Math.min(minWater, waterStartTime[i] + waterDuration[i]);            
        }

        // Step 2: Calculate path for Land -> Water
        int waterTime = Integer.MAX_VALUE;
        for (int i = 0; i < waterDuration.length; i++) {
            int actualWaterStart = Math.max(waterStartTime[i], minLand);
            waterTime = Math.min(waterTime, actualWaterStart + waterDuration[i]);
        }
        
        // Step 3: Calculate path for Water -> Land
        int landTime = Integer.MAX_VALUE;
        for (int i = 0; i < landDuration.length; i++) {
            int actualLandStart = Math.max(landStartTime[i], minWater);
            landTime = Math.min(landTime, actualLandStart + landDuration[i]);
        }

        // Return the absolute quickest path
        return Math.min(landTime, waterTime);
    }
}

