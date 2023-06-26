import java.sql.Array;
public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = {17,12,10,2,7,2,11,20,8};
        int k = 3;
        int candidates = 4;
        Total_Cost_to_Hire_K_Workers to_Hire_K_Workers = new Total_Cost_to_Hire_K_Workers();
        System.out.println(to_Hire_K_Workers.totalCost(arr, k, candidates));
        
    }
}
