
package testingiscooler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog();
        Zoo zoo = new Zoo();
        String s;
        boolean exit = false;
        
        while (!exit){
            System.out.println("1) Add a hedgehog, 2) Let them speak, 3) List animals, 0) Exit");

            if(sc.hasNext()) {
                int i = 0;
                s = sc.nextLine();
                
                i = Integer.parseInt(s);

                switch(i){
                    case 1:
                        System.out.println("Give a name to the hedgehog:");
                        String name = sc.nextLine();
                        zoo.addAnimal(name);
                        break;
                        
                    case 2:
                        hedgehog.speak();
                        if (sc.hasNextInt()) {
                            hedgehog.speak(zoo.hedgehogs,1);
                            sc.nextLine();

                        }else {
                            String str = sc.nextLine();
                            hedgehog.speak(zoo.hedgehogs,str);
                        }
                        break;
                        
                    case 3:
                        zoo.printInformation();                       
                        break;
                        
                    case 0:
                        exit=true;
                        break;
                    
                    default:
                        System.out.println("command not found");
                
                }
            
            }
            
        
        }sc.close();

    }
}
