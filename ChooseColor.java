public class ChooseColor {
    int minute;

    public void setMinute(int minute) {
        this.minute = minute;
    }

    void chooseColor() {
        if (minute % 5 == 1 | minute % 5 == 2 | minute % 5 == 3) {
            GreenLight greenLight = new GreenLight();
            greenLight.greenLightIsOn();
        } else if (minute % 5 == 4) {
            YellowLight yellowLight = new YellowLight();
            yellowLight.yellowLightIsOn();
        } else if (minute % 5 == 0) {
            RedLight redLight = new RedLight();
            redLight.redLightIsOn();
        }
    }
}
