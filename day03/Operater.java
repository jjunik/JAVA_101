package day03;

public class Operater {
    public static void main(String[] args) {
        // Operater[연산자]
        // 산술 연산자
        // +, -, *, /[몫], %[나머지], ++, --
        // System.out.println(5 % 2);
        // System.out.println(10 % 3);
        // System.out.println(15 % 5);

        // int a = 10;
        // a++;
        // System.out.println(a);
        // a--;
        // System.out.println(a);



        // 비교 연산자
        // >, <, >=, <=, ==, !=
        // int b = 10;
        // int c = 5;
        //        System.out.println(b > c);
        //        System.out.println(b < c);
        //        System.out.println(b <= c);
        //        System.out.println(b >= c);
        //        System.out.println(b == c);
        //        System.out.println(b != c);

        // 논리 연산자: and , or, not
        // &&[and], ||[or], ![not]
        // &&: 모두 true 이면 true
        // ||: 하나라도 true 이면 true
        boolean m = true;
        boolean n = false;
        System.out.println(m && n); //false
        System.out.println(m || n); //true
        System.out.println(!n); //true

        // 대입 연산자
        // =, +=, -=, *=, /=
        int h = 10;
        //h = h + 5
        h += 5; // 15
        h *= 3; // 45
        h -= 20; // 25
        System.out.println(h);

        // 삼항 연산자
        // 조건 ? 참 : 거짓
        int i = 10;
        int j = 20;
        String result = i > j ? "아메리카노" : "라떼";
        System.out.println(result); //라떼












    }
}
