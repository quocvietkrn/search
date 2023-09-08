/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Numberlist;
import view.View;

/**
 *
 * @author quocv
 */
public class NumberlistController {

    private Numberlist model;
    private View view;

    public NumberlistController(Numberlist model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addNumber(int number) {
        model.addNumber(number);
    }

    public void getUserInput() {
        view.getUserInput();
    }

}
