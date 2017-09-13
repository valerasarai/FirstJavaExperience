package com.valerastudy;

import org.apache.commons.lang3.StringUtils;

public class SeeMyText {
    public static void main(String[] args) {
        String text = "Acesta este textul meu!";
        System.out.println(text);
        text = StringUtils.replace(text,"!", " ai inteles!!!");
        System.out.println(text);

    }
}