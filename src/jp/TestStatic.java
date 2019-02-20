package jp;

public class TestStatic {
    //pole statyczne
    public static int a = 1;
    //pole nie statyczne
    public int b = 2;
    //metoda stayczna
    public static void printVar(){
        System.out.println(a);
       // System.out.println(b);
    }

    public static void main(String[] args) {
        TestStatic st = new TestStatic();
        st.printVar();
    }
    }

