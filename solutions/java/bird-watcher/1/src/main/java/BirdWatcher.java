
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int day: birdsPerDay){
            if(day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birds = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        
        for(int i = 0; i < limit; i++){
            birds = birds + birdsPerDay[i];
        }
        return birds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int day: birdsPerDay){
            if(day >= 5){
                busyDays += 1;
            }    
        }
        return busyDays;
    }
}
