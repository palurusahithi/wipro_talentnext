package abstraction_questions;

public class Question_2 {

 
    abstract static class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }

    
    static class Hero extends Vehicle {
        public String getModelName() {
            return "Hero Splendor";
        }

        public String getRegistrationNumber() {
            return "TS09XX1234";
        }

        public String getOwnerName() {
            return "Ravi";
        }

        public int getSpeed() {
            return 60;
        }

        public void radio() {
            System.out.println("Radio is ON in Hero");
        }
    }

    
    static class Honda extends Vehicle {
        public String getModelName() {
            return "Honda City";
        }

        public String getRegistrationNumber() {
            return "AP10YY9876";
        }

        public String getOwnerName() {
            return "Sneha";
        }

        public int getSpeed() {
            return 100;
        }

        public void cdPlayer() {
            System.out.println("CD Player is ON in Honda");
        }
    }

    
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("--- Hero Bike ---");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();
        System.out.println("--- Honda Car ---");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdPlayer();
    }
}
