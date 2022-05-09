package _01_introduction_to_java.read_number_to_letter.switch_case;

import java.util.Scanner;

/**
 * 1000 case => 2k lines
 * hang chuc & hang don vi => 200 line
 * mang => 20 lines
 */
public class ReadNumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else { // [0~999]
            // number đúng
            // TH1: 1 chữ số
            if (number < 10) {
                switch (number) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One  ");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            } else {
                // TH2: Nhập vào 2 chữ số
                //TH2.1 => 10-> 19
                if (number < 20) {
                    switch (number) {
                        case 10:
                            System.out.print("Ten");
                            break;
                        case 11:
                            System.out.print("eleven  ");
                            break;
                        case 12:
                            System.out.print("twelve");
                            break;
                        case 13:
                            System.out.print("thirteen");
                            break;
                        case 14:
                            System.out.print("fourteen");
                            break;
                        case 15:
                            System.out.print("fifteen");
                            break;
                        case 16:
                            System.out.print("sixteen");
                            break;
                        case 17:
                            System.out.print("seventeen");
                            break;
                        case 18:
                            System.out.print("eighteen");
                            break;
                        case 19:
                            System.out.print("nineteen");
                            break;
                    }
                } else {// [20~99]
                    // hàng chục => 25 => number / 10

                    if (number >= 100) { // 3 chữ số
                        // 125 => 1
                        switch (number / 100) {
                            case 1:
                                System.out.print("One  ");
                                break;
                            case 2:
                                System.out.print("Two");
                                break;
                            case 3:
                                System.out.print("Three");
                                break;
                            case 4:
                                System.out.print("Four");
                                break;
                            case 5:
                                System.out.print("Five");
                                break;
                            case 6:
                                System.out.print("Six");
                                break;
                            case 7:
                                System.out.print("Seven");
                                break;
                            case 8:
                                System.out.print("Eight");
                                break;
                            case 9:
                                System.out.print("Nine");
                                break;
                        }

                        System.out.print(" hundred " + ((number % 100 == 0) ? "" : " and "));

                        number %= 100; // 2 chữ số
                    }


                    switch (number / 10) {
                        case 2:
                            System.out.print("twenty ");
                            break;
                        case 3:
                            System.out.print("thirty ");
                            break;
                        case 4:
                            System.out.print("forty ");
                            break;
                        case 5:
                            System.out.print("fifty ");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("seventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("ninety ");
                            break;
                    }

                    // hàng đơn vị number % 10 =>9%10
                    switch (number % 10) {
                        case 1:
                            System.out.print("One  ");
                            break;
                        case 2:
                            System.out.print("Two");
                            break;
                        case 3:
                            System.out.print("Three");
                            break;
                        case 4:
                            System.out.print("Four");
                            break;
                        case 5:
                            System.out.print("Five");
                            break;
                        case 6:
                            System.out.print("Six");
                            break;
                        case 7:
                            System.out.print("Seven");
                            break;
                        case 8:
                            System.out.print("Eight");
                            break;
                        case 9:
                            System.out.print("Nine");
                            break;
                    }
                }
                //TH2.2 -> hàng chục 2-9
            }
        }
    }
}