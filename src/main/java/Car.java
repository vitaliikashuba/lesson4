public class Car extends Vehicles {


    private int speed;
    private int maxSpeed;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String name, String size, int speed, String type) {
        super(name, size);
        this.speed = speed;
        this.type = type;
    }

    public Car(String name, String size, int speed, String type, int maxSpeed) {
        super(name, size);
        this.speed = speed;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        this.speed++;
        if(this.speed > this.maxSpeed){
            this.speed = this.maxSpeed;
            System.out.println("Speed is maximum for this car: " + this.speed);
        }
        else {
            System.out.println("Speed: " + this.speed);
        }
    }

    public void increaseSpeed(int amount) {
        this.speed += amount;
        if(this.speed > this.maxSpeed){
            this.speed = this.maxSpeed;
            System.out.println("Speed is maximum for this car: " + this.speed);
        }else {
            System.out.println("Speed: " + this.speed);
        }
    }

    public void decreaseSpeed() {
        this.speed--;
        if(this.speed < 0){
            this.speed = 0;
        }
        System.out.println("Speed: " + this.speed);
    }

    public void decreaseSpeed(int amount) {
        this.speed -= amount;
        if(this.speed < 0){
            this.speed = 0;
        }
        System.out.println("Speed: " + this.speed);
    }

}
