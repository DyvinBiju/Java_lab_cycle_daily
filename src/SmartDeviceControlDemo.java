// Task 2 - Smart Device Control System
// Demonstrates Interfaces and Multiple Inheritance

// Interface for Wi-Fi feature
interface WiFiEnabled {
    void connectWiFi();
}

// Interface for Voice Control
interface VoiceControlled {
    void voiceCommand();
}

// Interface for Music Player
interface MusicPlayer {
    void playMusic();
}

// Interface for Video Streaming
interface VideoStreaming {
    void streamVideo();
}

// Interface for Temperature Monitoring
interface TemperatureMonitor {
    void displayTemperature();
}

// Smart Speaker
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Voice command accepted.");
    }

    public void playMusic() {
        System.out.println("Playing music.");
    }
}

// Smart TV
class SmartTV implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Voice control activated.");
    }

    public void playMusic() {
        System.out.println("Playing music on TV.");
    }

    public void streamVideo() {
        System.out.println("Streaming video.");
    }
}

// Smart AC
class SmartAC implements WiFiEnabled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void displayTemperature() {
        System.out.println("Current Temperature : 24°C");
    }
}

// Smart Watch
class SmartWatch implements WiFiEnabled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void displayTemperature() {
        System.out.println("Body Temperature : 36.7°C");
    }
}

// Smart Car (Added without modifying interfaces)
class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Car connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Voice navigation started.");
    }

    public void playMusic() {
        System.out.println("Playing music in the car.");
    }

    public void streamVideo() {
        System.out.println("Streaming video to rear-seat display.");
    }
}

// Driver Class
public class SmartDeviceControlDemo {

    public static void main(String[] args) {

        System.out.println("===== SMART SPEAKER =====");
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectWiFi();
        speaker.voiceCommand();
        speaker.playMusic();

        System.out.println();

        System.out.println("===== SMART TV =====");
        SmartTV tv = new SmartTV();
        tv.connectWiFi();
        tv.voiceCommand();
        tv.playMusic();
        tv.streamVideo();

        System.out.println();

        System.out.println("===== SMART AC =====");
        SmartAC ac = new SmartAC();
        ac.connectWiFi();
        ac.displayTemperature();

        System.out.println();

        System.out.println("===== SMART WATCH =====");
        SmartWatch watch = new SmartWatch();
        watch.connectWiFi();
        watch.displayTemperature();

        System.out.println();

        System.out.println("===== SMART CAR =====");
        SmartCar car = new SmartCar();
        car.connectWiFi();
        car.voiceCommand();
        car.playMusic();
        car.streamVideo();
    }
}