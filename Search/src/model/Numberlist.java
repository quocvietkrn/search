/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quocv
 */
// Tạo một lớp để biểu diễn Model (Danh sách số nguyên):
public class Numberlist {

    // khởi tạo list
    private List<Integer> numbers;

    // contructor
    public Numberlist() {
        numbers = new ArrayList<>();
    }

    // add number vào list
    public void addNumber(int number) {
        numbers.add(number);
    }

    // get tung phan tu
    public List<Integer> getNumbers() {
        return numbers;
    }

    // set phan tu (làm sẵn)
    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }


    // thuat toan tìm kiếm và check lỗi ko phải là số nguyên
    public int findNumberAtIndex(int index) {
        if (index >= 0 && index < numbers.size()) {
            return numbers.get(index);
        } else {
            return -1; // Trả về -1 nếu vị trí không hợp lệ
        }
    }
}
