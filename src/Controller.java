import java.util.Scanner;

public class Controller {
    public void Algorithm(int option) {
        Algorithms algorithms = new Algorithms();
        switch(option) {

            case 0:
                System.out.println("Exiting system...");
                System.exit(0);
                break;

            case 1:
                algorithms.Alghoritm01();
                break;

            case 2:
                algorithms.Alghoritm02();
                break;

            case 3:
                algorithms.Alghoritm03();
                break;

            case 4:
                algorithms.Alghoritm04();
                break;

            case 5:
                algorithms.Alghoritm05();
                break;

            case 6:
                algorithms.Alghoritm06();
                break;

            case 7:
                algorithms.Alghoritm07();
                break;

            case 8:
                algorithms.Alghoritm08();
                break;

            case 9:
                algorithms.Alghoritm09();
                break;

            case 10:
                algorithms.Alghoritm10();
                break;

            case 11:
                algorithms.Alghoritm11();
                break;

            case 12:
                algorithms.Alghoritm12();
                break;

            case 13:
                algorithms.Alghoritm13();
                break;

            case 14:
                algorithms.Alghoritm14();
                break;

            case 15:
                algorithms.Alghoritm15();
                break;
        }
    }
}
