import service.tempService;
import service.tempServiceImpl;
import view.tempView;

public class conversionTempV2 {
    public static void main(String[] args) {
        tempService tempService = new tempServiceImpl();
        tempView tempView = new tempView(tempService);

        tempView.showTemp();
    }
}
