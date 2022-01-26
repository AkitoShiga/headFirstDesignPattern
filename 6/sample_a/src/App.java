public class App {
    public static void main(String[] args) throws Exception {
        /*
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        Garage garage = new Garage();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garage);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        */
        RemoteControl remoteControl = new RemoteControl();
        Light  libingRoomLight = new Light("リビングルーム");
        Light  kitchenLight = new Light("キッチンライト");
        Garage garageDoor = new Garage();
        Stereo stereo = new Stereo();

        LightCommand livingRoomLightOn = 
    }
}
