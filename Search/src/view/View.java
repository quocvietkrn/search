/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import java.util.Scanner;
import model.Numberlist;

/**
 *
 * @author quocv
 */
public class View {

    private Numberlist model;

    public View(Numberlist model) {
        this.model = model;
    }

    // nhap va in ra vi tri can tim
    public void getUserInput() {
        System.out.print("Nhập vị trí cần tìm kiếm trong danh sách: ");
        Scanner scanner = new Scanner(System.in);
        int indexToSearch = scanner.nextInt();

        int result = model.findNumberAtIndex(indexToSearch);

        if (result != -1) {
            System.out.println("Số nguyên tại vị trí " + indexToSearch + " là: " + result);
        } else {
            System.out.println("Vị trí không hợp lệ. Không tìm thấy số nguyên.");
        }
    }
}
