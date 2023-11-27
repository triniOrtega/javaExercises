/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingactivities;

import programmingactivities.objectoriented.Circle;

import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asura
 */
public class EjerciciosMigue {

    int myValue = 10;

    public EjerciciosMigue() {
        System.setProperty("line.separator", "\n");
        System.out.println("constructor defecto");

    }

    public void ejercicio4(int a, int b, int c) {
//        int a = -5;
//        int b = 8;
//        int c = 6;

        System.out.println(a + b * c);

        int x = 55;
        int y = 9;

        System.out.println((x + y) % y);

        System.out.println(20 + -3 * 5 / 8);

        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

    }

    public void ejercicio7(int number) {

        for (int i = 1; i <= 10; i++) {
            int producto = number * i;
            System.out.println(number + " x " + i + " = " + producto);
        }
    }

    public void ejercicio11() {
        double pi = 3.1416;
        double radio = 7.5;

        System.out.println("perimetro = " + 2 * pi * radio);
        System.out.println("area = " + pi * radio * radio);
    }

    public String ejercicio15(int variable1, int variable2) {
        int auxiliar = variable1;
        variable1 = variable2;
        variable2 = auxiliar;
        return "variable 1 = " + variable1 + "; variable 2 = " + variable2;
    }

    public String ejercicio19(int decnumber) {

        int auxiliar = decnumber;
        String resto = "";

        while (decnumber / 2 >= 1) {
            resto = "" + decnumber % 2 + resto;
            decnumber = decnumber / 2;
        }
        return  "El numero " + auxiliar + " en binario es: " + decnumber + resto;

    }

    public void ejercicio37() {

        Scanner input_sentence = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String sentence = input_sentence.nextLine();
        String reverse = "";

        for (int i = sentence.length() - 1; 0 <= i; i--) {
            char character = sentence.charAt(i);
            reverse = reverse + character;
        }
        System.out.println(reverse);
    }

    public void ejercicio50() {

        int[] solution1 = new int[100];
        int contadorsolution1 = 0;
        int[] solution2 = new int[100];
        int contadorsolution2 = 0;
        int[] solution3 = new int[100];
        int contadorsolution3 = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                solution1[contadorsolution1] = i;
                contadorsolution1++;
            }
            if (i % 5 == 0) {
                solution2[contadorsolution2] = i;
                contadorsolution2++;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                solution3[contadorsolution3] = i;
                contadorsolution3++;
            }
        }

        System.out.println("Divided by 3:");
        for (int i = 0; i < contadorsolution1; i++) {
            System.out.print(solution1[i] + ",");
        }
        System.out.println("\n \nDivided by 5:");
        for (int i = 0; i < contadorsolution2; i++) {
            System.out.print(solution2[i] + ",");
        }
        System.out.println("\n \nDivided by 3 and 5:");
        for (int i = 0; i < contadorsolution3; i++) {
            System.out.print(solution3[i] + ",");
        }
    }

    public void ejercicio52() {

        Scanner teclado_int = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int number1 = teclado_int.nextInt();

        System.out.println("Input the second number: ");
        int number2 = teclado_int.nextInt();

        System.out.println("Enter the solution: ");
        int solution = teclado_int.nextInt();

        if (solution == number1 + number2) {
            System.out.println("The result is: " + true);
        } else {
            System.out.println("The reslut is: " + false);
        }
    }

    public void ejercicio60() {

        Scanner input_sentence = new Scanner(System.in);
        System.out.println("Input a String: ");
        String sentence = input_sentence.nextLine();
        String[] words = sentence.split(" ");
        System.out.println(words[words.length - 2]);
    }

    public void ejercicio64() {

        Scanner teclado_int = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int number1 = teclado_int.nextInt();

        if (number1 >= 25 && number1 <= 75) {
            System.out.println("Input the second number: ");
            int number2 = teclado_int.nextInt();
            if (number2 >= 25 & number2 <= 75) {
                int restonumber1 = number1 % 10;
                int restonumber2 = number2 % 10;
                int decenanumber1 = number1 / 10;
                int decenanumber2 = number2 / 10;

                if (restonumber1 == restonumber2
                        || decenanumber1 == decenanumber2
                        || restonumber1 == decenanumber2
                        || restonumber2 == decenanumber1) {
                    System.out.println("Result:" + true);
                } else {
                    System.out.println("Result>" + false);
                }
            }
        } else {
            System.out.println("number not valid");
        }

    }

    String[] trinisplit(String sentence, String separator) {
        String[] result = new String[10];

        return result;
    }

    public void ejercicio66() {

        int number = 2;
        int contador = 0;
        int suma = 0;

        while (contador < 100) {
            boolean isPrime = true;
            for (int i = 2; i <= number && isPrime == true; i++) {
                if (number % i == 0 && i != number) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                contador = contador + 1;
                suma = suma + number;
            }
            number++;
        }

        System.out.println(suma);
    }

    public void ejercicio69() {

        String evensentence = "Python";
        int longitud = evensentence.length();
        int subcadena = longitud / 2;
        String resultado = evensentence.substring(0, subcadena);
        System.out.println(resultado);

    }

    public void ejercicio71() {

        String Str1 = "Python";
        String Str2 = "Tutorial";
        int ultima1 = Str1.length();
        int ultima2 = Str2.length();
        String subcadena1 = Str1.substring(1, ultima1);
        String subcadena2 = Str2.substring(1, ultima2);
        String resultado = subcadena1 + subcadena2;
        System.out.println(resultado);

        System.out.println(
                Str1.substring(1, Str1.length())
                + Str2.substring(1, Str2.length()));

    }

    public void ejercicio77() {

        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        int[] newArray = new int[2];
        newArray[0] = array1[0];
        newArray[1] = array2[2];

        System.out.println(Arrays.toString(newArray));

    }

    public void ejercicio121() {

        List linkedlist1 = new ArrayList();
        linkedlist1.add(20);
        linkedlist1.add(40);
        linkedlist1.add(60);
        linkedlist1.add(80);
        List linkedlist2 = new ArrayList();

        for (int i = linkedlist1.size() - 1; i >= 0; i--) {
            linkedlist2.add(linkedlist1.get(i));
        }
        System.out.println(linkedlist2);

    }

    public void ejercicionuevo1() {

        File myFile = new File("Data.txt");
        if (myFile.exists()) {
            System.out.println(myFile.getName() + " exists");
            System.out.println("The file is "
                    + myFile.length() + " bytes long");
            if (myFile.canRead()) {
                System.out.println(" ok to read");
            } else {
                System.out.println(" not ok to read");
            }
            if (myFile.canWrite()) {
                System.out.println(" ok to write");
            } else {
                System.out.println(" not ok to write");
            }
            System.out.println("path: " + myFile.getAbsolutePath());
            System.out.println("File Name: " + myFile.getName());
            System.out.println("File Size: " + myFile.length() + " bytes");

        } else {
            System.out.println("File does not exist");
        }
    }

    public void ejercicionuevo2() throws IOException {
        try {
            InputStream istream;
            int c;
            istream = System.in;
            FileWriter outFile = new FileWriter("Data.txt");
            BufferedWriter bWriter = new BufferedWriter(outFile);
            System.out.println("Type characters to write in File - Press z to end ");

            while ((c = istream.read()) != 'z') {
                bWriter.write(c);
            }
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ejercicionuevo1_2() {

        Circle defaultcircle = new Circle();
        System.out.println(defaultcircle.toString());

        Circle customizedcircle = new Circle(4);
        System.out.println(customizedcircle.toString());

        Circle personalizedcircle = new Circle();
        Scanner input_radius = new Scanner(System.in);
        System.out.println("Introduce el radio de tu circulo:");
        double radius = input_radius.nextDouble();

        personalizedcircle.setRadius(radius);

        System.out.println("Radio: " 
                + personalizedcircle.getRadius());
        System.out.println("Area: " 
                + personalizedcircle.getArea());
        System.out.println("Circumference: "
                + personalizedcircle.getCircumference());

    }
}
