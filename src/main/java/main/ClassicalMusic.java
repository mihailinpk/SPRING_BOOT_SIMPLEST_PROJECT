package main;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music    {

    @Override
    public String getSong() {
        return "У любви как у пташки крылья";
    }

}