package view;

import service.tempService;
import util.inputUtil;

public class tempView {

    private final tempService tempService;

    public tempView(service.tempService tempService) {
        this.tempService = tempService;
    }


    public void showTemp() {
        tempService.clearScreen();
        System.out.println("\n=======================");
        System.out.println("CONVERSION TEMPERATURE");
        System.out.println("=======================");
        String conver1 = inputUtil.input("what do you want to conversion ");
        String conver2 = inputUtil.input("from " + conver1 + " to ");
        int number = inputUtil.inputNumber("Enter the number ");

        tempService.Converison(conver1, conver2, number);
    }
}
