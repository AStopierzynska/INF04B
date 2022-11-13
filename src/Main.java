import java.util.Scanner;

public class Main {

    void kalkulator(){

        Scanner klaw = new Scanner(System.in);
        double a, b, wynik;
        int wybor;

        System.out.println("Kalkulator");
        System.out.println("------------------\n");
        System.out.println("Podaj pierwszą liczbę:");
        a = klaw.nextDouble();
        System.out.println("POdaj drugą liczbę:");
        b = klaw.nextDouble();
        System.out.println("\nWybierz działanie: ");
        System.out.println("1. dodawanie");
        System.out.println("2. odejmowanie");
        System.out.println("3. mnożenie");
        System.out.println("4. dzielenie");
        System.out.println("5. modulo");
        System.out.println("0. wyjście");
        System.out.println("Twój wybór: ");
        wybor = klaw.nextInt();
        /*
        if(wybor == 1){
            wynik = a + b;
            System.out.println("wynik a + b = " + wynik);
        }
        if(wybor == 2){
            wynik = a - b;
            System.out.println("wynik a - b =  " + wynik);
        }
        if(wybor == 3){
            wynik = a * b;
            System.out.println("wynik a * b =  " + wynik);
        }
        if(wybor == 4){
            if(b==0){
                System.out.println("Nie dzieli się przez zero");
            }else{
                wynik = a / b;
                System.out.println("wynik a / b =  " + wynik);
            }
        }
        if(wybor == 5){
            wynik = a % b;
            System.out.println("wynik a % b = " + wynik);
        }
        if(wybor == 0 )System.out.println("Koniec naszego liczenia");
        */

        public static int suma (int suma){
            int suma = a+b;
            return suma;
        }
        public static int roznica (int roznica){
            int roznica = a-b;
            return roznica;
        }
        public static int mnozenie (int mnozenie){
            int mnozenie = a*b;
            return mnozenie;
        }
        public static double dzielenie (double dzielenie){
            double dzielenie = a/b;
            return dzielenie;
        }
        public static double modulo (double modulo){
            double modulo = a%b;
            return modulo;
        }
        /*
        switch(wybor){
            case 1:
                wynik = a + b;
                System.out.println("wynik a + b = " + wynik);
                break;
            case 2:
                wynik = a - b;
                System.out.println("wynik a - b = " + wynik);
                break;
            case 3:
                wynik = a * b;
                System.out.println("wynik a * b = " + wynik);
                break;
            case 4:
                if(b==0){
                    System.out.println("Nie dzieli się przez zero");
                    break;
                }else{
                    wynik = a / b;
                    System.out.println("wynik a / b =  " + wynik);
                    break;
                }
            case 5:
                wynik = a % b;
                System.out.println("wynik a % b = " + wynik);
                break;
            case 0:
                System.out.println("Koniec naszego liczenia");
                break;
            default:
                System.out.println("Wybrałeś złą opcję z menu");
                break;
        }
        */
        /*        switch(wybor){
            case 1 -> {
                wynik = a + b;
                System.out.println("wynik a + b = " + wynik);
            }
            case 2 -> {
                wynik = a - b;
                System.out.println("wynik a - b = " + wynik);
            }
            case 3 -> {
                wynik = a * b;
                System.out.println("wynik a * b = " + wynik);
            }
            case 4 -> {
                if(b==0){
                    System.out.println("Nie dzieli się przez zero");
                }else{
                    wynik = a / b;
                    System.out.println("wynik a / b =  " + wynik);
                }
            }
            case 5 -> {
                wynik = a % b;
                System.out.println("wynik a % b = " + wynik);
            }
            case 0 -> System.out.println("Koniec naszego liczenia");
            default -> System.out.println("Wybrałeś złą opcję z menu");
        }*/
        switch(wybor){
            case 1 -> {
                wynik = a + b;
                System.out.println("wynik a + b = " + wynik);
            }
            case 2 -> {
                wynik = a - b;
                System.out.println("wynik a - b = " + wynik);
            }
            case 3 -> {
                wynik = a * b;
                System.out.println("wynik a * b = " + wynik);
            }
            case 4 -> {
                if(b==0){
                    System.out.println("Nie dzieli się przez zero");
                }else{
                    wynik = a / b;
                    System.out.println("wynik a / b =  " + wynik);
                }
            }
            case 5 -> {
                wynik = a % b;
                System.out.println("wynik a % b = " + wynik);
            }
            case 0 -> System.out.println("Koniec naszego liczenia");
            default -> System.out.println("Wybrałeś złą opcję z menu");
        }


    }

    public static void main(String[] args) {

        Main cos = new Main();

        cos.kalkulator();



    }
}