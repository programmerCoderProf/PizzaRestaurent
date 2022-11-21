/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizaarestaurant;

import java.util.ArrayList;

/**
 *
 * @author H3D
 */
public class PizaaRestaurant {

    ArrayList<Pizza> pizzas;
    ArrayList<Drink> drinks;
    ArrayList<Order> orders;

    public PizaaRestaurant() {
        this.pizzas = new ArrayList<Pizza>();
        this.drinks = new ArrayList<Drink>();
        this.orders = new ArrayList<Order>();
    }

    public void addPizza(Pizza p) {
        
        pizzas.add(p);
        System.out.println("\nAdded Sccessfully");
    }

    public void addDrink(Drink d) {
        drinks.add(d);
        System.out.println("\nAdded Sccessfully");
    }

    public void addOrder(Order o) {
        orders.add(o);
        System.out.println("\nAdded Sccessfully");
    }
    public void displayPizzas()
    {
        String pz="";
        for(int i=0;i<pizzas.size() ; i++)
        {
            pz+=pizzas.get(i).toString();
        }
        System.out.println(pz);
    }
    public void displayDrinks()
    {
        String dr="";
        for(int i=0;i<drinks.size() ; i++)
        {
            dr+=drinks.get(i).toString();
        }
        System.out.println(dr);
    }
    public void displayOrders()
    {
        String ord="";
        for(int i=0;i<orders.size() ; i++)
        {
                ord+=orders.get(i).toString()+"\n";
        }
        System.out.println(ord);
    }
}
