/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructer;

class A {

    int a;
    String b;
    boolean c;

    A() {
        a = 10;
        b = "akash";
        c = true;
    }

    void disp() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class defoultconstructer {

    public static void main(String[] args) {
        A s1 = new A();
        s1.disp();
    }

}
