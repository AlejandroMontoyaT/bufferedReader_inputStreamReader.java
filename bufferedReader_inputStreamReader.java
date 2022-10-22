import java.io.BufferedReader;
import java.io.InputStreamReader;

class Test{  

    public static void main(String[] args) {
  
        BufferedReader reader ;
        reader = new BufferedReader(new InputStreamReader(System.in));

        String line ="";
        try{
            line = reader.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(line);
        }
    }
}
