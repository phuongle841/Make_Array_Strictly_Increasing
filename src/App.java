import java.sql.Array;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = {1,5,3,6,7};
        int[] arr2 =  {1,3,2,4};
        int resultOfMake_Array_Strictly_Increasing;
        Make_Array_Strictly_Increasing make_Array_Strictly_Increasing = new Make_Array_Strictly_Increasing();
        resultOfMake_Array_Strictly_Increasing = make_Array_Strictly_Increasing.makeArrayIncreasing(arr, arr2);
        // System.out.println(resultOfMake_Array_Strictly_Increasing);

        int[] arr3 =  {7,4,3,9,1,8,5,2,6};
        K_Radius_Subarray_Averages k_Radius_Subarray_Averages = new K_Radius_Subarray_Averages();
        int[] resultOfK_Radius_Subarray_Averages = k_Radius_Subarray_Averages.getAverages(arr3, 3);
        // for (int i = 0; i < resultOfK_Radius_Subarray_Averages.length; i++) {
        //     System.out.print(resultOfK_Radius_Subarray_Averages[i]+" ");
        // }
        
        int[] arr4 ={1,3,5,2},arr5 ={2,3,1,14};
        Minimum_Cost_to_Make_Array_Equal minimum_Cost_to_Make_Array_Equal = new Minimum_Cost_to_Make_Array_Equal();
        long resultOfMinimum_Cost_to_Make_Array_Equal = minimum_Cost_to_Make_Array_Equal.minCost(arr4, arr5);
        System.out.println(resultOfMinimum_Cost_to_Make_Array_Equal);
    }
}
