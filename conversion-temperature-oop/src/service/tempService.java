package service;

public interface tempService {

    void Converison(String conver1, String conver2, int number);

    int CtoReamur(int Temperature);

    int CtoFahrenheit(int Temperature);

    int CtoKelvin(int Temperature);

    int RtoCelcius(int Temperature);

    int RtoFahrenheit(int Temperature);

    int RtoKelvin(int Temperature);

    int KtoCelcius(int Temperature);

    float KtoReamur(int Temperature);

    int KtoFahrenheit(int Temperature);

    float FtoKelvin(int Temperature);

    float FtoCelcius(int Temperature);

    float FtoReamur(int Temperature);

    void clearScreen();
}
