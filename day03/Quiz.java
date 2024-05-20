package day03;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("영어 점수를 입력하세요.");
//        int eng = sc.nextInt();
//        int min = 60;
//        String result = eng >= min ? "합격" : "불합격";
//        System.out.println(result + "입니다.");
//
//
//        System.out.println("정수를 입력하세요.");
//        int num = sc.nextInt();
//        String res = num > 0 ? "양수" : "음수";
//        System.out.println(res + "입니다.");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫 번째 정수");
//        int first = sc.nextInt();
//        System.out.println("두 번째 정수");
//        int second = sc.nextInt();
//        int bigger = first > second ? first : second;
//        System.out.println("큰 수는 " + bigger);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자 입력");
//        int num = sc.nextInt();
//        int absNum = num > 0 ? num : -num;
//        System.out.println("절대값은 " + absNum);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수 입력");
//        int num = sc.nextInt();
//        String result = num % 2 == 1 ? "홀수" : "짝수";
//        System.out.println(num + "은 " + result + "입니다");

        //1. 이메일을 입력받고, 형식에 맞는지 체크하기
        // @포함, .포함, naver 또는 gmail만 가능

        Scanner sc = new Scanner(System.in);
        System.out.println("이메일을 입력하세요");
        String email = sc.next();
        String result = email.contains("naver") || email.contains("gmaill") ? " 이상없음" : " 재확인";
        String result2 = email.contains("@") && email.contains(".") ? " 이상없음" : " 재확인";
        System.out.println("메일주소" + result);
        System.out.println("@ , ." + result2);




        //2. 과일 이름을 입력 받고, 6글자 이하이면 대문자화하고 이상이면 3글자만 나타내기

        System.out.println("과일이름을 입력하세요.");
        String fruit = sc.next();
        String name = fruit.length() <= 6 ? fruit.toUpperCase() : fruit.substring(0,3);
        System.out.println(name);







    }
}
















