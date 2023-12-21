package Package2;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\IntelliJ\\Try\\src\\Package2\\file_example_WAV_1MG.wav");

        try {
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);

            String response = "";
//            response= response.toUpperCase();
            while (!response.equals("Q")) {
                System.out.println("P= play, S = Stop, R = reset");
                System.out.println("Enter your choice: ");
                response = scanner.next();
                response = response.toUpperCase();
                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.close();
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("Not a valid response");
                }
            }

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}