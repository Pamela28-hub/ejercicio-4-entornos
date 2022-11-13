/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author PAMELA GARCIA
 */
public class NumB10 {

    public static void main(String[] args) {

    }
    private int num;

    public NumB10(int num) {
        this.num = num;
    }
    public void setNum(int num) {
    this.num = num;
    }
    @Override
    public String toString() {
    return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
    return num; // (error 1)
    }
}
