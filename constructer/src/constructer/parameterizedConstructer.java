/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructer;

class A {

    int x, y;

    A(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println(x + " " + y);
    }
}

public class parameterizedConstructer {

    public static void main(String[] args) {
        A s1 = new A(10,20);
        s1.show();
    }
}
