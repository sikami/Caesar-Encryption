package com.caesar;

public class Main {
    public static void main(String[] args) {
        Caesar caesar = new Caesar(3, "Z");
        String result = caesar.encrypt();
        System.out.println(result);

    }
}
