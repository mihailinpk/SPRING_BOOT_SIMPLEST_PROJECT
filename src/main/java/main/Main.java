package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private ApplicationContext context;

    @Autowired
    public void context(ApplicationContext context) { this.context = context; }

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.playMusic();
    }

}