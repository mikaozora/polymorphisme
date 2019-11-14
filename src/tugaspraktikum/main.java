/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

/**
 *
 * @author ASUS GAMING PC
 */
public class main {
    public static void main(String[] args) {
        Rect a = new Rect(1,1,4,4);
        int x = a.x1;
        int y = a.y1;
        int z = a.x2;
        int w = a.y2;
        Rect b = new Rect(5,6);
        a.move(1, 2);
        
        System.out.println("<"+a.x1+","+a.y1+"> is inside the union");
        System.out.println("["+x+","+y+"; "+z+","+w+"] union ["+a.x1+","+a.y1+"; "+b.x2+","+b.y2+"] = ["+x+","+y+"; "+b.x2+","+b.y2+"]");
        System.out.println("["+x+","+y+"; "+z+","+w+"] union ["+a.x1+","+a.y1+"; "+b.x2+","+b.y2+"] = ["+a.x1+","+a.y1+"; "+z+","+w+"]");
    }
}
