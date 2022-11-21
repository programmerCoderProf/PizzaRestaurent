/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizaarestaurant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        PizaaRestaurant pr = new PizaaRestaurant();
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\tRestaurent Shopping");
            System.out.println("\n1. Add Pizza");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Pizza Order");
            System.out.println("4. Add Drink Order");
            System.out.println("5. Cancel An Order");
            System.out.println("6. Display All Pizza");
            System.out.println("7. Display All Drink");
            System.out.println("8. Display All Orders");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            try {
                
                int ch2 = Integer.parseInt(scan.next());
                if (ch2 == 1) {
                    Pizza p = new Pizza();
                    System.out.print("Enter ID: ");
                    p.setID(Integer.parseInt(scan.next()));
                    System.out.print("Enter name: ");
                    p.setName(scan.next());
                    System.out.print("Enter the price: ");
                    p.setPrice(Double.parseDouble(scan.next()));
                    System.out.print("Enter the quantity: ");
                    p.setQuantity(Integer.parseInt(scan.next()));
                    scan.nextLine();
                    System.out.print("Enter the description: ");
                    p.setdescription(scan.nextLine());
                    pr.addPizza(p);
                } else if (ch2 == 2) {
                    Drink d = new Drink();
                    System.out.print("Enter ID: ");
                    d.setID(Integer.parseInt(scan.next()));
                    System.out.print("Enter name: ");
                    d.setName(scan.next());
                    System.out.print("Enter the price: ");
                    d.setPrice(Double.parseDouble(scan.next()));
                    System.out.print("Enter the quantity: ");
                    d.setQuantity(Integer.parseInt(scan.next()));
                    System.out.print("Enter the fill in leters: ");
                    d.setFill(Integer.parseInt(scan.next()));
                    pr.addDrink(d);
                } else if (ch2 == 3) {
                    if (pr.pizzas.isEmpty()) {
                        System.out.println("There is no pitzzas now");
                    } else {
                        pr.displayPizzas();
                        boolean flag = false;
                        int index = 0;
                        System.out.print("Enter id from the list: ");
                        int pzId = Integer.parseInt(scan.next());
                        for (int i = 0; i < pr.pizzas.size(); i++) {
                            if (pzId == pr.pizzas.get(i).id) {
                                flag = true;
                                index = i;
                                break;
                            }
                        }
                        if (flag) {
                            System.out.print("Enter quantity: ");
                            int qty = Integer.parseInt(scan.next());
                            if (qty <= pr.pizzas.get(index).getQuantity()) {
                                System.out.print("Enter order Id: ");
                                int ordId = (Integer.parseInt(scan.next()));
                                String ordType = "Pizza";
                                pr.pizzas.get(index).setQuantity(pr.pizzas.get(index).getQuantity() - qty);
                                Pizza p2 = new Pizza(
                                        pr.pizzas.get(index).getId(),
                                        pr.pizzas.get(index).getName(),
                                        pr.pizzas.get(index).getPrice(),
                                        qty,
                                        pr.pizzas.get(index).getDescription()
                                );
                                p2.setQuantity(qty);
                                Order ord = new Order(ordId, ordType, p2);
                                ord.setTotalPrice(pr.pizzas.get(index).getPrice() * qty);
                                pr.addOrder(ord);
                            } else {
                                System.out.println("Not enought");
                            }
                        } else {
                            System.out.println("Not Found!");
                        }

                    }
                } else if (ch2 == 4) {
                    if (pr.drinks.isEmpty()) {
                        System.out.println("There is no drinks now");
                    } else {
                        pr.displayDrinks();
                        boolean flag = false;
                        int index = 0;
                        System.out.print("Enter id from the list: ");
                        int dId = Integer.parseInt(scan.next());
                        for (int i = 0; i < pr.drinks.size(); i++) {
                            if (dId == pr.drinks.get(i).getId()) {
                                flag = true;
                                index = i;
                                break;
                            }
                        }
                        if (flag) {
                            System.out.print("Enter quantity: ");
                            int qty = Integer.parseInt(scan.next());
                            if (qty <= pr.drinks.get(index).getQuantity()) {
                                System.out.print("Enter order Id: ");
                                int ordId = (Integer.parseInt(scan.next()));
                                String ordType = "Drink";
                                pr.drinks.get(index).setQuantity(pr.drinks.get(index).getQuantity() - qty);
                                Drink d2 = new Drink(
                                        pr.drinks.get(index).getId(),
                                        pr.drinks.get(index).getName(),
                                        pr.drinks.get(index).getPrice(),
                                        qty,
                                        pr.drinks.get(index).getFill()
                                );
                                d2.setQuantity(qty);
                                Order ord = new Order(ordId, ordType, d2);
                                ord.setTotalPrice(pr.drinks.get(index).getPrice() * qty);
                                pr.addOrder(ord);
                            } else {
                                System.out.println("Not enought");
                            }
                        } else {
                            System.out.println("Not Found!");
                        }
                    }
                } else if (ch2 == 5) {
                    if (pr.orders.isEmpty()) {
                        System.out.println("There is no orders now");
                    } else {
                        pr.displayOrders();
                        boolean flag = false;
                        int index = 0;
                        System.out.print("Enter order id from the list: ");
                        int oId = Integer.parseInt(scan.next());
                        for (int i = 0; i < pr.orders.size(); i++) {
                            if (oId == pr.orders.get(i).getId()) {
                                flag = true;
                                index = i;
                                break;
                            }
                        }
                        if (flag) {
                            Order ord2 = new Order();
                            ord2 = pr.orders.get(index);
                            pr.orders.get(index).cancelOrder(ord2);
                            System.out.println("The order canceled successfully");
                        } else {
                            System.out.println("Not Found!");
                        }
                    }
                } else if (ch2 == 6) {
                    if (pr.drinks.isEmpty()) {
                        System.out.println("There is no pizzas now");
                    } else {
                        pr.displayPizzas();
                    }
                } else if (ch2 == 7) {
                    if (pr.drinks.isEmpty()) {
                        System.out.println("There is no drinks now");
                    } else {
                        pr.displayDrinks();
                    }
                } else if (ch2 == 8) {
                    if (pr.orders.isEmpty()) {
                        System.out.println("There is no orders now");
                    } else {
                        pr.displayOrders();
                    }
                } else if (ch2 == 9) {
                    System.out.println("\n\t**Thanks**");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            } catch (NumberFormatException exception) {
                System.out.println("you must enter a numeric values: ");
            }
        }
    }
}
