
package testingiscooler;

import java.util.ArrayList;

public class Zoo {

    ArrayList<String> hedgehogs = new ArrayList<>();
    
    public void addAnimal(String name){
        hedgehogs.add(name);
        System.out.println("Hi, my name is "+name+".");
    }
    
    public void printInformation(){
        for(String s: hedgehogs){
            System.out.println(s);
        }
    
    
    }
    
}
