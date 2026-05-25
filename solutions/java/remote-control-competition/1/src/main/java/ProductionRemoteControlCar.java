class ProductionRemoteControlCar implements RemoteControlCar,Comparable <ProductionRemoteControlCar>{
    int distance = 0;
    int numberOfVictories = 0;
    
    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    
    public int compareTo(ProductionRemoteControlCar other){
        if(this.numberOfVictories > other.numberOfVictories){
            return -1;
        }else if(this.numberOfVictories < other.numberOfVictories){
            return 1;
        }else{
            return 0;
        }
    }
}
