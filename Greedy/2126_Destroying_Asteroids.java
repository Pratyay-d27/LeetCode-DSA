class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long key = mass;
        for(int i = 0; i<asteroids.length; i++)
        {
            if((long)asteroids[i] > key)
            return false;

            key = key + asteroids[i];
        }
        return true;
    }
}
