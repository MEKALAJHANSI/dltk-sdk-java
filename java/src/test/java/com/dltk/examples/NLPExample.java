package com.dltk.examples;

import org.json.JSONObject;

import com.dltk.DltkAiClient;

import java.io.IOException;

public class NLPExample {
    public static void main(String[] args) {

        DltkAiClient c = new DltkAiClient("xxx");
        JSONObject r = null;
        try {
            r = c.nerTagger("Apple is a Big Organization");
            System.out.print(r);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
