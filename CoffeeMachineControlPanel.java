package machine;
import java.util.*;

public class CoffeeMachine {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;

        
        
        //while loop, "exit" terminate the loop
        boolean shouldExit = false;
        while(shouldExit != true) {
            
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
            
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    
                    String option = scanner.next();
                    
                    switch (option) {
                        case "1":
                        /*  System.out.println("The coffee machine has:");
                            System.out.println(water + " of water");
                            System.out.println(milk + " of milk");
                            System.out.println(coffeeBeans + " of coffee beans");
                            System.out.println(cups + " of disposable cups");
                            System.out.println(money + " of money");
                        */
                            if (water >= 250 && coffeeBeans >= 16 && cups >= 1)  {
                            System.out.println("I have enough resources, making you a coffee!");    
                               
                                money += 4;
                                water -= 250;
                                coffeeBeans -= 16;
                                cups -= 1;
                            } else {
                                System.out.println("I don't have enough resources");
                            }
                                
                        /*    System.out.println("The coffee machine has:");
                            System.out.println(water + " of water");
                            System.out.println(milk + " of milk");
                            System.out.println(coffeeBeans + " of coffee beans");
                            System.out.println(cups + " of disposable cups");
                            System.out.println(money + " of money");  
                        */    
                            
                            break;
                        
                        case "2":
                        /*    System.out.println("The coffee machine has:");
                            System.out.println(water + " of water");
                            System.out.println(milk + " of milk");
                            System.out.println(coffeeBeans + " of coffee beans");
                            System.out.println(cups + " of disposable cups");
                            System.out.println(money + " of money");
                        */   
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1)  {
                            System.out.println("I have enough resources, making you a coffee!"); 
                                money += 7;
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                cups -= 1;
                            } else {
                                System.out.println("I don't have enough resources");
                            }
                                
                        /*    System.out.println("The coffee machine has:");
                            System.out.println(water + " of water");
                            System.out.println(milk + " of milk");
                            System.out.println(coffeeBeans + " of coffee beans");
                            System.out.println(cups + " of disposable cups");
                            System.out.println(money + " of money");  
                        */    
                            break;
                            
                        case "3":
                        /*  System.out.println("The coffee machine has:");
                            System.out.println(water + " of water");
                            System.out.println(milk + " of milk");
                            System.out.println(coffeeBeans + " of coffee beans");
                            System.out.println(cups + " of disposable cups");
                            System.out.println(money + " of money");     
                        */
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1)  {
                            System.out.println("I have enough resources, making you a coffee!");                            
                                money += 6;
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                cups -= 1;
                            } else {
                                System.out.println("I don't have enough resources");
                            }
                                
                        /*  System.out.println("The coffee machine has:");
                            System.out.println(water + " of water");
                            System.out.println(milk + " of milk");
                            System.out.println(coffeeBeans + " of coffee beans");
                            System.out.println(cups + " of disposable cups");
                            System.out.println(money + " of money");  
                        */    
                            break;
                            
                        case "back":
                        shouldExit = false;
                            break;
                    
                    }
                    
                    shouldExit = false;
                    
                    break;  

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterAdded = scanner.nextInt();
                    water += waterAdded;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkAdded = scanner.nextInt();
                    milk += milkAdded;
                    System.out.println("Write how many grams of coffee do you want to add:");
                    int coffeeAdded = scanner.nextInt();
                    coffeeBeans += coffeeAdded;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cupsAdded = scanner.nextInt();
                    cups += cupsAdded;  
                    
                /*    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");  
                */    
                    shouldExit = false;
                    
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                /*    
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");  
                */    
                    shouldExit = false;
                    
                    break;

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    
                    shouldExit = false;
                    
                    break;

                case "exit":
                    shouldExit = true;
                    break;
            }
            
        }
        
    }
}       