package programmingactivities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosTrini {
    public EjerciciosTrini() {

    }

    public int ejercicio41(int a, int b, int c) {

        return a+b*c;

    }

    public int ejercicio42(int a, int b) {

        return (a+b)%b;
    }

    public int ejercicio43(int a, int b, int c, int d) {

        return a+b*c/d;
    }

    public int ejercicio44(int a, int b, int c, int d, int e) {

        return a+b/c*d-e%c;
    }

    public String ejercicio37(String a) {

        String resultado = "";

        for (int i = a.length() -1; i >= 0; i--) {
            resultado += a.charAt(i);
        }

        return resultado;
    }

    public ContadorChar ejercicio38(String frase) {

        ContadorChar resultado = new ContadorChar();

        int letras = 0;
        int digitos = 0;
        int espacios = 0;
        int otros = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (Character.isLetter(frase.charAt(i))) {

                letras ++;

            } else if (Character.isDigit(frase.charAt(i))) {

                digitos ++;

            } else if (Character.isSpaceChar(frase.charAt(i))) {

                espacios ++;

            } else {

                otros ++;

            }
        }

        resultado.letras = letras;
        resultado.numeros = digitos;
        resultado.setEspacios(espacios);
        resultado.otros = otros;

        return resultado;
    }

    public ArrayList<Integer> ejercicio48(int a) {

        ArrayList<Integer> resultado = new ArrayList<Integer>();

        for (int i = 1; i < a; i++) {

            if (i%2 == 1) {

                resultado.add(i);

            }

        }

        return resultado;

    }

    public String ejercicio52() {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int firstNumber = inputNumber.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = inputNumber.nextInt();
        System.out.println("Input the third number: ");
        int thirdNumber = inputNumber.nextInt();

        boolean resultado = false;

        if (firstNumber+secondNumber == thirdNumber ) {

            resultado = true;

        }
        return "The result is: "+resultado;

    }

    public String ejercicio55() {

        Scanner inputSeconds = new Scanner(System.in);

        System.out.println("Input seconds: ");
        int initialSeconds = inputSeconds.nextInt();

        int intermediateMinutes = initialSeconds/60;
        int hours = intermediateMinutes/60;
        int minutes = intermediateMinutes%60;
        int seconds = initialSeconds%60;

        return hours+":"+minutes+":"+seconds;

    }

    public String ejercicio64() {
        Scanner value = new Scanner(System.in);

        boolean result = false;
        System.out.println("Input the first number: ");
        int firstValue = value.nextInt();

        if (firstValue <25 || firstValue >75) {
            System.out.println("Try a different number");
        } else {
            System.out.println("Input the second number: ");
            int secondValue = value.nextInt();

            if (secondValue <25 || secondValue >75) {
                System.out.println("Try a different number");
            } else {
                String firstValueDigits = Integer.toString(firstValue);
                String secondValueDigits = Integer.toString(secondValue);

                for (int i=0; i<firstValueDigits.length(); i++) {
                    for (int j=0; j<secondValueDigits.length(); j++) {
                        if (firstValueDigits.charAt(i) == secondValueDigits.charAt(j)) {
                            result = true;
                            break;
                        }
                    }
                }
            }
        }

        return "Result: "+result;

    }

    public String ejercicio641() {

        Scanner value = new Scanner(System.in);

        boolean result = false;
        System.out.println("Input the first number: ");
        int firstValue = value.nextInt();

        if (firstValue <25 || firstValue >75) {
            System.out.println("Try a different number");
        } else {
            System.out.println("Input the second number: ");
            int secondValue = value.nextInt();

            if (secondValue <25 || secondValue >75) {
                System.out.println("Try a different number");
            } else {
                int firstValueDigit1 = firstValue/10;
                int firstValueDigit2 = firstValue%10;
                int secondValueDigit1 = secondValue/10;
                int secondValueDigit2 = secondValue%10;

                if (firstValueDigit1 == secondValueDigit1
                        || firstValueDigit1 == secondValueDigit2
                        || firstValueDigit2 == secondValueDigit1
                        || firstValueDigit2 == secondValueDigit2) {

                    result = true;
                }
            }
        }

        return "Result: "+result;

    }

    public String ejercicio83() {

        int[] array1 = {1,3,-5,4};
        int[] array2 = {1,4,-5,-2};


        List<Integer> result = new ArrayList<Integer>();

        for (int i =0; i<array1.length; i++) {

            for (int j=0; j<array2.length; j++) {
                if (i==j) {
                    result.add(array1[i]*array2[j]);

                }
            }
        }

        return "Result: "+result;
    }

}
