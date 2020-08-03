package com.caesar;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Caesar {

    private int key;
    private String text;

    public Caesar(int key) {
        this.key = (key > 26)? verifyKey(): key;
    }

    public Caesar(String text) {
        this.text = text;
    }

    public Caesar(int key, String text) {
        this.key = key;
        this.text = text;
    }

    public Caesar() {
    }

    private int verifyKey() {
        while(this.key > 26) {
            this.key -= 25;
        }
        return this.key;
    }

    public String encrypt(String text) {
        int key = verifyKey();

        char result = 0;
        String texts = null;
        for(char i = 0; i < text.length(); i++) {
            result = convert(i);
        }
        texts += result;
        return texts;
        
    }
    private char convert(char word) {
        int ascii;
         if (isUpperCase(word)) {
             if(word + this.key > 'Z') {
                 ascii = word + this.key - 26;
                 return (char) ascii;
             } else {
                 ascii = word + this.key;
                 return (char) ascii;
             }
          } else if (isLowerCase(word)) {
             if(word +this.key > 'z') {
                 ascii = word + this.key - 26;
                 return (char) ascii;
             } else {
                 ascii = word + this.key;
                 return (char) ascii;
             }
         } else {
             return word;
         }
    }
}
