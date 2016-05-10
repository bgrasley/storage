/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

/**
 *
 * @author Brandon Grasley
 * @author Your Name Here!
 */
public class Testing {

    public static void main(String[] args) {

        LinearIntStore myData = new LinearIntStore();

        /*
        Here are a few operations with the LinearIntStore, along with
        println statements to see what's in there (you can also use breakpoints
        to figure this out). You'll need to implement the toString() method
        for the println calls to work!
        */
        myData.append(17);
        myData.append(35);
        myData.append(20);

        myData.removeElementAt(0);

        System.out.println("myData contains: " + myData);
        
        myData.insertElementAt(55,1);
        
        System.out.println("myData contains: " + myData);

    }
}
