import java.sql.Array;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = {1,2,3,6};
        Tallest_Billboard res = new Tallest_Billboard();
        System.out.println(res.tallestBillboard(arr));
    }
}
