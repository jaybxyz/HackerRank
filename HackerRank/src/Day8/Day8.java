package Day8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Day8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        in.nextLine();
        
        // Create a HashMap that contains name and phone as key / value. 
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            // Write code here
            in.nextLine();
            map.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            
            // Write code here
            if (map.get(s) == null) {
				System.out.println("Not found");
			}else{
				System.out.println(s + "=" + map.get(s));
			}
        }
        in.close();
		
	}

}
