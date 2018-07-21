package main;

import impl.date.test.TestDate;
import impl.other.test.TestOther;

public class Main {
    public static void main(String[] args) {

        TestDate dateTest = new TestDate();
        TestOther testOther = new TestOther();

        System.out.println("Даты:");
        dateTest.start();

        System.out.println();
        System.out.println("Прочее:");
        testOther.start();
    }
}
