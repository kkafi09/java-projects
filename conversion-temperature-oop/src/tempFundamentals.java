import java.util.Scanner;

public class tempFundamentals {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean isAgain = true;

        while (isAgain){
            clearScreen();
            System.out.println("=======================");
            System.out.println("CONVERSION TEMPERATURE");
            System.out.println("=======================");
            System.out.print("what do you want to convert : ");
            String data = sc.next().toLowerCase();
            System.out.printf("from %s to : ", data);
            String conver = sc.next().toLowerCase();
            System.out.print("enter the number : ");
            int number = sc.nextInt();

            // conversion
            switch (data + conver) {
                case "cr" -> System.out.println("result Celcius to Reamur is : " + CtoReamur(number));
                case "cf" -> System.out.println("result Celcius to Fahrenheit is : " + CtoFahrenheit(number));
                case "ck" -> System.out.println("result Celcius to Kelvin is : " + CtoKelvin(number));
                case "fr" -> System.out.println("result Fahrenheit to Reamur is : " + FtoReamur(number));
                case "fc" -> System.out.println("result Fahrenheit to Celcius is : " + FtoCelcius(number));
                case "fk" -> System.out.println("result Fahrenheit to Kelvin is : " + FtoKelvin(number));
                case "rc" -> System.out.println("result Reamur to Celcius is : " + RtoCelcius(number));
                case "rf" -> System.out.println("result Reamur to Fahrenheit is : " + RtoFahrenheit(number));
                case "rk" -> System.out.println("result Reamur to Kelvin is : " + RtoKelvin(number));
                case "kr" -> System.out.println("result Kelvin to Reamur is : " + KtoReamur(number));
                case "kc" -> System.out.println("result Kelvin to Celcius is : " + KtoCelcius(number));
                case "kf" -> System.out.println("result Kelvin to Fahrenheit is : " + KtoFahrenheit(number));
                case "cc", "ff", "kk", "rr" -> System.out.printf("result is : %d\n", number);
                default -> System.out.println("pilihan tidak dimengerti");
            }

            System.out.print("do you want to conversion again? ");
            String ask = sc.next().toLowerCase();
            if(ask.equals("yes")) isAgain = false;
        }
    }

    // conversion logic

    public static int CtoReamur(int Temperature){
        return 4 * Temperature / 5;
    }

    public static int CtoFahrenheit(int Temperature){
        return (9 * Temperature / 5) + 32;
    }

    public static int CtoKelvin(int Temperature){
        return 273 + Temperature;
    }

    public static int RtoCelcius(int Temperature){
        return 4 * Temperature / 5;
    }

    public static int RtoFahrenheit(int Temperature){
        return (9 * Temperature / 4) + 32;
    }

    public static int RtoKelvin(int Temperature){
        return 273 + Temperature;
    }

    public static int KtoCelcius(int Temperature){
        return Temperature - 273;
    }

    public static float KtoReamur(int Temperature){
        return (float)4 / 5 * (Temperature - 273);
    }

    public static int KtoFahrenheit(int Temperature){
        return (Temperature - 273) * 9/5 + 32;
    }

    public static float FtoKelvin(int Temperature){
        return (float)(Temperature - 32) * 5/9 + 273;
    }

    public static float FtoCelcius(int Temperature){
        return (float)(Temperature - 32) * 5 / 9;
    }

    public static float FtoReamur(int Temperature){
        return (float)(Temperature - 32) * 4/9;
    }

    // last conversion logic

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        } catch (Exception e){
            System.err.println("Cannot Clear Screen");
        }
    }
}
