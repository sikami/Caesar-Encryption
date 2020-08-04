package com.caesar;

public class Main {
    public static void main(String[] args) {
        Caesar caesar = new Caesar(13, "hello, world");
        String result = caesar.encrypt();
        System.out.println(result);

    }
}
