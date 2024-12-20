package c07.controller;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    private boolean water = false;
    private String thermostat = "Day";

    private class LightOn extends Event{
        public LightOn(long eventTime){
            super(eventTime);
        }
        public void action(){
            light = true;
        }
        public String description(){
            return "Light is on";
        }
    }

    private class LightOff extends Event{
        public LightOff(long eventTime){
            super(eventTime);
        }
        public void action(){
            light = false;
        }
        public String description(){
            return "Light is off";
        }
    }

    private class WaterOn extends Event{
        public WaterOn(long eventTime){
            super(eventTime);
        }
        public void action(){
            water = true;
        }
        public String description(){
            return "Water is on";
        }
    }

    private class WaterOff extends Event{
        public WaterOff(long eventTime){
            super(eventTime);
        }
        public void action(){
            water = false;
        }
        public String description(){
            return "Water is off";
        }
    }

    private class ThermostatNight extends Event{
        public ThermostatNight(long eventTime){
            super(eventTime);
        }
        public void action(){
            thermostat = "Night";
        }
        public String description(){
            return "Thermostat on night setting";
        }
    }

    private class ThermostatDay extends Event{
        public ThermostatDay(long eventTime){
            super(eventTime);
        }
        public void action(){
            thermostat = "Day";
        }
        public String description(){
            return "Thermostat on day setting";
        }
    }

    private int rings;
    private class Bell extends Event{
        public Bell(long eventTime){
            super(eventTime);
        }
        public void action(){
            System.out.println("嘀...!");
            if (--rings > 0){
                addEvent(new Bell(System.currentTimeMillis() + 2000));
            }
        }
        public String description(){
            return "Ring bell";
        }
    }

    private class Restart extends Event{
        public Restart(long eventTime){
            super(eventTime);
        }
        public void action(){
            long tm = System.currentTimeMillis();
            rings = 5;
            addEvent(new ThermostatNight(tm));
            addEvent(new LightOn(tm + 1000));
            addEvent(new LightOff(tm + 2000));
            addEvent(new WaterOn(tm + 3000));
            addEvent(new WaterOff(tm + 8000));
            addEvent(new ThermostatDay(tm + 10000));
            addEvent(new Restart(tm + 20000));
        }
        public String description(){
            return "Restarting system";
        }
    }

    public static void main(String[] args){
        GreenhouseControls gc = new GreenhouseControls();
        long tm = System.currentTimeMillis();
        gc.addEvent(gc.new Restart(tm));
        gc.run();
    }
}
