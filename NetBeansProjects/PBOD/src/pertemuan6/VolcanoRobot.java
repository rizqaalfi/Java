/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 * Rizqa Alfiani
 * E31191919
 */
class VolcanoRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature(){
        if (temperature > 660) {
            status = "returning bone";
            speed = 5;
        }
    }

    void showAtributes(){
        System.out.println("Status : " +status);
        System.out.println("Speed : " +speed);
        System.out.println("Temperature : " +temperature);
    }

    public static void main(String[] arguments){
        VolcanoRobot dante = new VolcanoRobot();
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        dante.showAtributes();
        System.out.println("Increasing speed to 3");
        dante.speed = 3;
        dante.showAtributes();
        System.out.println("Changing temperature to 670");
        dante.temperature = 670;
        dante.showAtributes();
        System.out.println("Checking the temperature");
        dante.checkTemperature();
        dante.showAtributes();
}
}
