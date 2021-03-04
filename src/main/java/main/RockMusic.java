package main;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Я не сошел с ума";
    }

}