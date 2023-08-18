package model;

public class Car {

    String name;
    int location;

    public Car(String name) {
        this.name = setName(name);
        location = 0;
    }

    private String setName(String name) {
        if(name.length() > 5){
            throw new StringIndexOutOfBoundsException("length : " + name.length());
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        if(isRunning()){
            location += 1;
        }

    }

    private boolean isRunning(){
        return (Math.random() * 10) >= 4;
    }

    public int getLocation() {
        return location;
    }
}
