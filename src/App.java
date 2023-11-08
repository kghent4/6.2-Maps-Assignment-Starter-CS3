import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.apache.commons.lang3.time.StopWatch;
//sfdsfdsfdsfds
public class App {
    public static void main(String[] args) throws Exception{
//sfdsfdsfdsfdsfdsf
      /*  int[] ar = {3, 10, 2000, -6, 70};
        for(int i = 0; i < 5; i++){
            System.out.println(ar[i]);
        }

        ar[2] = 1;
        for(int i = 0; i < 5; i++){
            System.out.println(ar[i]);
        }

        System.out.print(ar.length);

*/




        StopWatch s = new StopWatch();
        Map<Integer, String> inventory = new TreeMap<Integer, String>();
        
        //Fill TreeMap using fill() (below)
        s.start();
        fillMap(inventory);
        s.stop();
        System.out.println(s.getNanoTime());
        s.reset();

       
       
       
       
       
       
       
       
       //Create HashMap
       /*
        //Fill HashMap using fill() (below)
        //Add 3 things to TreeMap
        //Add 3 things to HashMap
        //Remove 3 things from TreeMap
        //Remove 3 things from HashMap
        //Check for 3 things in TreeMap, by item name
        //Check for 3 things in HashMap, by item name

        /*
         * Timer tools
         * start() starts the timer
         * stop() stops the timer
         * getNanoTime() will show you the time elapsed in nanoseconds
         * reset() resets the timer
         */
    }

    //Fills a given map with IDs and inventory items based on Inventory.txt (100 items)
    public static void fillMap(Map m) throws Exception {
        File f = new File("src/Inventory.txt");
        Scanner s = new Scanner(f);
        String item = s.nextLine();
        for(int i = 0; i < 190; i++){
            m.put(Integer.parseInt(item.substring(0, 6)), item.substring(8));
        }
        s.close();
    }
}
