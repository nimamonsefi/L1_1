/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person p=new Person();
        
        System.out.print("Enter Your Income : ");
        p.setIncome(scanner.nextDouble());
        
        System.out.print("Enter Your Instalment : ");
        p.setInstalment(scanner.nextDouble());
        
        System.out.println("Your Take-Home Pay : "+p.takeHomePay());
        
    }
    
}
