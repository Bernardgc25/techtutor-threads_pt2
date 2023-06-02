package listLoader;
import java.util.ArrayList;
import java.util.List;
 

public class ListLoader{
    List<Integer> list = new ArrayList<>();
    public void loadlist(int startNumber, int lastNumber) {
        for (int i = startNumber; i < lastNumber; i++) {
            list.add(i);
            System.out.println("number:" + i);
            try {
                Thread.sleep(500);
            } catch(Exception e)
                {System.out.println(e);}    
            //System.out.println(i); 
        }
    }
}


