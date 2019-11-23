package lt.sdacademy.calculator;

        import java.util.Scanner;


public class CalculatorMain {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);

        boolean calculate = true;
        double result = 0;

        while (calculate) {

          /*  System.out.println("Ivesk pirma skaiciu");
            double firstNum = numberScanner.nextDouble();

            System.out.println("Ivesk antra skaiciu");
            double secondNum = numberScanner.nextDouble();
 */
          double firstNum = getNum(numberScanner,"Iveskite pirma skaiciu");
          double secondNum = getNum(numberScanner,"Iveskite antra skaiciu");

            System.out.println("koki veiksma norite atlikti:+ - / *");
            String action = actionScanner.nextLine();

            result = getResult(action, firstNum, secondNum); //funkcija


          /*  switch (action) {
                case ("+"): {
                    System.out.println(firstNum + secondNum);
                    break;
                }
                case ("-"): {
                    System.out.println(firstNum - secondNum);
                    break;
                }
                case ("*"): {
                    System.out.println(firstNum * secondNum);
                    break;
                }
                case ("/"): {
                    System.out.println(firstNum / secondNum);
                    break;
                }
                default: {
                    System.out.println("Veiksmas nerastas");
                }

           */
//            if (action.equals("+")) {
//                System.out.println(firstNum + secondNum);
//            } else {
//                System.out.println("Nezinomas veiksmas");

            System.out.println("Gautas rezultatas: " + result);
            System.out.println("Ar norite skaiciuoti toliau? TAIP : NE");
            String answer = actionScanner.nextLine();
            //if (answer.equals("NE") || answer.toLowerCase().equals("ne ")) {
            if (answer.equalsIgnoreCase("NE")){
                calculate = false;

            }
        }
    }

// pakeistas kodas ir padaryta per funkcija, kas uzkomentuota tai is pirmos dalies
    private static double getNum(Scanner numberScanner, String message){
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }

    private static double getResult(String action, double num1, double num2){  // rasom funcija kuri grazintu rezultata
        switch (action) {
            case ("+"): {
                return (num1 + num2);
               // break;
            }
            case ("-"): {
                return(num1 - num2);
              //  break;
            }
            case ("*"): {
                return (num1 * num2);
              //  break;
            }
            case ("/"): {
                return (num1 / num2);
              //  break;
            }
            default: {
                System.out.println("Veiksmas nerastas");
                return 0;
            }
        }

    }
}


