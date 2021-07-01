package service;

public class tempServiceImpl implements tempService {

    @Override
    public void Converison(String conver1, String conver2, int number) {
        switch (conver1 + conver2) {
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
    }

    public int CtoReamur(int Temperature) {
        return 4 * Temperature / 5;
    }

    public int CtoFahrenheit(int Temperature) {
        return (9 * Temperature / 5) + 32;
    }

    public int CtoKelvin(int Temperature) {
        return 273 + Temperature;
    }

    public int RtoCelcius(int Temperature) {
        return 4 * Temperature / 5;
    }

    public int RtoFahrenheit(int Temperature) {
        return (9 * Temperature / 4) + 32;
    }

    public int RtoKelvin(int Temperature) {
        return 273 + Temperature;
    }

    public int KtoCelcius(int Temperature) {
        return Temperature - 273;
    }

    public float KtoReamur(int Temperature) {
        return (float) 4 / 5 * (Temperature - 273);
    }

    public int KtoFahrenheit(int Temperature) {
        return (Temperature - 273) * 9 / 5 + 32;
    }

    public float FtoKelvin(int Temperature) {
        return (float) (Temperature - 32) * 5 / 9 + 273;
    }

    public float FtoCelcius(int Temperature) {
        return (float) (Temperature - 32) * 5 / 9;
    }

    public float FtoReamur(int Temperature) {
        return (float) (Temperature - 32) * 4 / 9;
    }

    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.err.println("Cannot Clear Screen");
        }
    }
}
