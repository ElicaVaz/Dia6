
package SextoDia;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        float C = leitor.nextInt();
        
        float F = (9*C+160)/5;
        
        System.out.println("A temperatura de " + C + "ºC é de " + F + "ºF.");
        
        
    }
}
