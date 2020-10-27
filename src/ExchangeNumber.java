import java.util.Scanner;

public class ExchangeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Viết mẹ mày số muốn chuyển vào đê!!");
        int input = 0;
        try{
            input = Integer.parseInt(sc.nextLine());
            System.out.println("Kết quả này: " + exchangeNumber(input));
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
    public static String exchangeNumber(int inputNumber){
        String result = "";
        if (inputNumber > 999){
            result += getThousands(inputNumber);
            inputNumber = inputNumber % 1000;
        }

        if (inputNumber > 99){
            result += getHundreds(inputNumber);
            inputNumber = inputNumber % 100;
        }

        if (inputNumber > 9){
            result += getTens(inputNumber);
            inputNumber = inputNumber % 10;
        }

        result += getUnits(inputNumber);
        return result;
    }

    private static String getUnits(int inputNumber) {
        String result = "";
        switch (inputNumber){
            case 1:
                result += "I";
                break;
            case 2:
                result += "II";
                break;
            case 3:
                result += "III";
                break;
            case 4:
                result += "IV";
                break;
            case 5:
                result += "V";
                break;
            case 6:
                result += "VI";
                break;
            case 7:
                result += "VII";
                break;
            case 8:
                result += "VIII";
                break;
            case 9:
                result += "IX";
                break;
            default:
                System.out.println("No Unit");
        }
        return result;
    }

    private static String getTens(int inputNumber) {
        inputNumber = inputNumber/10;
        String result = "";
        switch (inputNumber){
            case 1:
                result += "X";
                break;
            case 2:
                result += "XX";
                break;
            case 3:
                result += "XXX";
                break;
            case 4:
                result += "XL";
                break;
            case 5:
                result += "L";
                break;
            case 6:
                result += "LX";
                break;
            case 7:
                result += "LXX";
                break;
            case 8:
                result += "LXXX";
                break;
            case 9:
                result += "XC";
                break;
            default:
                System.out.println("No Tens");
        }
        return result;
    }

    private static String getHundreds(int inputNumber) {
        inputNumber = inputNumber/100;
        String result = "";
        switch (inputNumber){
            case 1:
                result += "C";
                break;
            case 2:
                result += "CC";
                break;
            case 3:
                result += "CCC";
                break;
            case 4:
                result += "CD";
                break;
            case 5:
                result += "D";
                break;
            case 6:
                result += "DC";
                break;
            case 7:
                result += "DCC";
                break;
            case 8:
                result += "DCCC";
                break;
            case 9:
                result += "CM";
                break;
            default:
                System.out.println("No Hundreds");
        }
        return result;
    }

    public static String getThousands(int inputNumber){
        inputNumber = inputNumber/1000;
        String result = "";
        switch (inputNumber){
            case 1:
                result += "M";
                break;
            case 2:
                result += "MM";
                break;
            case 3:
                result += "MMM";
                break;
            case 4:
                result +="MMMM";
                break;
            case 5:
                result +="MMMMM";
                break;
            default:
                System.out.println("No thousands");
        }
        return result;
    }
}