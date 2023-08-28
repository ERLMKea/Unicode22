package com.example.unicode22.config;

import com.example.unicode22.model.Unicode;
import com.example.unicode22.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {

        int sz = unicodeRepository.findAll().size();

        if (sz > 65000) return;


        int maxValue = Character.MAX_VALUE;
        Set<Character> chars = new HashSet<>();

        for (char c = 0; c < Character.MAX_VALUE; c++) {
            //if (Character.isLetter(c)) , betyder der kun kommer 48909 char i Set
                chars.add(c);
        }

        int i = 0;
        for (char c: chars) {
            Unicode unicode = new Unicode();
            unicode.setCharx(c);
            unicodeRepository.save(unicode);
            if (i%1000 == 0) System.out.println("Jeg er nået til i=" + i);
            i++;
        }

    }
}
