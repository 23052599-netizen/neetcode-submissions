class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int minspeed = 1;
        int maxspeed = 0 ;
        for(int pile : piles){
            maxspeed = Math.max(maxspeed , pile);
        }
        while(minspeed<maxspeed){
        int mid = minspeed + (maxspeed - minspeed)/2;

        if(caneat(piles,h,mid)){
            maxspeed = mid;
        }else{
            minspeed = mid + 1;
        }
    
    }
    return minspeed;
    }
    private boolean caneat(int[] piles, int h, int speed) {

    int totalHours = 0;

    // Check every pile
    for (int pile : piles) {

        // Hours needed for this pile
        totalHours += (int)Math.ceil((double)pile / speed);
    }

    // If total hours are within h, return true
    return totalHours <= h;


    }

}


        