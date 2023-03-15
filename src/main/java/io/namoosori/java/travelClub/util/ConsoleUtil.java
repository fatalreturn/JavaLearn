package io.namoosori.java.travelClub.util;

import java.util.Scanner;

public class ConsoleUtil {

    private Scanner scanner;

    public ConsoleUtil() {
        this.scanner = new Scanner(System.in);
    }

    public String getValueOf(String label) {
        System.out.print(label + " : ");
        String inputStr = scanner.nextLine();
        inputStr = inputStr.trim(); // 문자열 외의 공백 등을 생략해주는 역할 String class의 trim 메소드
        return inputStr;
    }
}
