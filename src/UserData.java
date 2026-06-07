import java.io.BufferedReader;
import java.io.FileReader;

public class UserData {

    public static ATM loadUser(String userName){
        String filePath = "user.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = br.readLine()) !=null){
                String[] data = line.split(",");

                if(data[0].equalsIgnoreCase(userName)){
                    String name = data[0];
                    int pin = Integer.parseInt(data[1]);
                    double balance = Double.parseDouble(data[2]);
                    String accNo = data[3];

                    return new ATM(name, pin, balance, accNo);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error reading user file: "+ e.getMessage());
        }
        return null;

    }
}