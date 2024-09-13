package org.example.ibroximjon.audio_converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class AudioConverterApplication {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        SpringApplication.run(AudioConverterApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        File file = new File("./src/main/resources/music.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        AudioFormat format = audioInputStream.getFormat();
        Clip clip = AudioSystem.getClip();

        clip.open(audioInputStream);

        clip.start();

        String response = scanner.nextLine();
    }

}
