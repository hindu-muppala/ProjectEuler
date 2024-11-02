import java.util.ArrayList;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
       
        
        
    }
    public ArrayList<ArrayList<String>> takingInput()
    {
        Scanner in = new Scanner(System.in);
        String s;
        ArrayList<ArrayList<String>> s0 = new ArrayList<>();

        while (true) {
            ArrayList<String> s1 = new ArrayList<>();
            int i=0;
            while (i!=7) {

                s = in.nextLine();
                if (s == "FFFF") {
                    
                    return s0;
                }
                s1.add(s);
                i+=1;

            }
            s0.add(s1);

        }

      

    } 
}
