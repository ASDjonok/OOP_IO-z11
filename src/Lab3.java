public class Lab3 {
    public static void main(String[] args) {
        String s = "A";
        System.out.println(s);
        s += "B";
        System.out.println(s);
        myMethod(s);
        System.out.println("???" + s);

        StringBuilder stringBuilder = new StringBuilder("BB");
        System.out.println("!!!" + stringBuilder);
        myMethod2(stringBuilder);
        System.out.println("???" + stringBuilder);
    }

    static void myMethod(String s) {
        s += "C";
        System.out.println(s);
    }

    static void myMethod2(StringBuilder s) {
        s.append("C");
        System.out.println(s);
    }
}
