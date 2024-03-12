/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructer;

class A {

    int a;
    String b;

    A() {
        a = 10;
        b = "Learncode";
    }

    A(A ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        A r = new A();
        A r2=new A(r);
    }
}
