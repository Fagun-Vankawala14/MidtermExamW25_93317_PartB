/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

import midtermexamw25_93317_partb.VendingMachine;
import midtermexamw25_93317_partb.VendingMachineItem;

/**
 *
 * @author soky4
 */
public class VendingMachineTester {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> candyList = new ArrayList<>();

        ArrayList<Double> priceList = new ArrayList<>();
    
        ArrayList<Boolean> availabilityList = new ArrayList<>();
                
        candyList.add("chocolate bar");
        priceList.add(1.50);
        availabilityList.add(true);
        candyList.add("gummies");
        priceList.add(2.00);
        availabilityList.add(true);
        candyList.add("mints");
        priceList.add(1.00);
        availabilityList.add(true);
        candyList.add("bag of chips");
        priceList.add(2.50);
        availabilityList.add(true);        
                
        VendingMachine vm = new VendingMachine(candyList, priceList, availabilityList);
        VendingMachineItem item1 = new VendingMachineItem("Nerdz", 1.00);
        VendingMachineItem item2 = new VendingMachineItem("Jujubes", 3.00);
        
        vm.addItem(item1);
        vm.addItem(item2);
        vm.displayMenu();
        
        vmi.selectItem("gummies");
        
        
      }
}
