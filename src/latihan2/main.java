/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author ASUS GAMING PC
 */
public class main {
    public static void main(String[] args) {
        Line a = new Line(5,10,15,20);
        System.out.println(a.getLength());
        System.out.println(a.isGreater(a, a));
        System.out.println(a.isLess(a, a));
        System.out.println(a.isEqual(a, a));
    }
}
