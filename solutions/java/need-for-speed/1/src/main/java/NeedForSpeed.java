class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int distanceDriven;
    public int battery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return !(battery >= batteryDrain);
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(battery >= batteryDrain){
            distanceDriven += speed;
            battery = battery - batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    public int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        var cycles = 100/car.batteryDrain;
        var totalDistance = cycles * car.speed;
        return totalDistance >= distance;
    }
}
