/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class DuckSimulator {
    public static void main (String[]args){
        int choose;
        Scanner input = new Scanner(System.in);
        do{
          System.out.println("Daftar Bebek");
          System.out.println("1. Mallard Duck");
          System.out.println("2. Model Duck");
          System.out.println("3. Rubber Duck");
          System.out.println("4. Decoy Duck");
          System.out.println("5. ReadHead Duck");
          System.out.println("Pilih bebek mu");
          choose = input.nextInt();
          
          switch(choose){
              case 1 ->{
                  Duck Bebek1 = new MallarDuck();
                  Bebek1.display();
                  Bebek1.performFly();
                  Bebek1.setFlyBehavior(new FlyNoWay());
                  Bebek1.performQuack();
                  Bebek1.setQuackBehavior(new Quack());
              }
              case 2 ->{
                  Duck Bebek2 = new ModelDuck();
                  Bebek2.display();
                  Bebek2.performFly();
                  Bebek2.setFlyBehavior(new FlyNoWay());
                  Bebek2.performQuack();
                  Bebek2.setQuackBehavior(new Quack());
              }
              case 3 ->{
                  Duck Bebek3 = new RubberDuck();
                  Bebek3.display();
                  Bebek3.performFly();
                  Bebek3.setFlyBehavior(new FlyNoWay());
                  Bebek3.performQuack();
                  Bebek3.setQuackBehavior(new Quack());
              }
              case 4 ->{
                  Duck Bebek4 = new DecoyDuck();
                  Bebek4.display();
                  Bebek4.performFly();
                  Bebek4.setFlyBehavior(new FlyNoWay());
                  Bebek4.performQuack();
                  Bebek4.setQuackBehavior(new Quack());
              }
              case 5 ->{
                  Duck Bebek5 = new RedHeadDuck();
                  Bebek5.display();
                  Bebek5.performFly();
                  Bebek5.setFlyBehavior(new FlyNoWay());
                  Bebek5.performQuack();
                  Bebek5.setQuackBehavior(new Quack());
              }
              default -> System.out.println("Pilihan yang anda masukan tidak valid");
          }
          System.out.println("Lanjut?(Iya/Tidak)");
            String in = input.next();
            if (in.equalsIgnoreCase("Tidak")){
                break;
            }
        }while(choose>0);
    }
}
