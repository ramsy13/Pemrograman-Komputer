/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

/**
 *
 * @author ASUS
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
}
    @Override
    public void display(){
        System.out.println("im a model duck");
    }
}

