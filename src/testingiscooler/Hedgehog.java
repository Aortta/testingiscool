
package testingiscooler;

import java.util.ArrayList;

public class Hedgehog {
    String name;

    public void speak(){
        System.out.println("What should the hedgehog say?");
    }
    public void speak(ArrayList<String> hedgehogs,String phrase){
        for(String s: hedgehogs){
            System.out.println(s+": "+phrase);
        }
    }
    public void speak(ArrayList<String> hedgehogs,int phrase){
        for(String s: hedgehogs){
            System.out.println(s+": I am a hedgehog. I do not understand numbers.");
        }
        
    }
}


