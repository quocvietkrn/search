/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.NumberlistController;
import model.Numberlist;

/**
 *
 * @author quocv
 */
public class Main {

    public static void main(String[] args) {
        Numberlist model = new Numberlist();
        View view = new View(model);
        NumberlistController controller = new NumberlistController(model, view);

        // Thêm số nguyên vào danh sách
        controller.addNumber(5);
        controller.addNumber(5);
        controller.addNumber(25);
        controller.addNumber(20);

      

        // Yêu cầu người dùng nhập vị trí cần tìm kiếm và hiển thị kết quả
        controller.getUserInput();
    }
}
