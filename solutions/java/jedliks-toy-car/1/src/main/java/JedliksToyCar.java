public class JedliksToyCar {
    public int meters = 0;
    public int percentage = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar newToyCar = new JedliksToyCar();
        return newToyCar;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", meters);
    }

    public String batteryDisplay() {
        if(percentage == 0){
            return "Battery empty";
        }else{
            return String.format("Battery at %d%%", percentage);
        }
        
    }

    public void drive() {
        if(percentage > 0){
            meters = meters + 20;
            percentage --;
        }  
    }
}
