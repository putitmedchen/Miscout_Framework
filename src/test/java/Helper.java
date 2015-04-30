/**
 * Created by sgo on 4/20/2015.
 */
public class Helper {
    
    private static String str = "000001111000011010101";
    private static int []mas = {2,4,7, -6,4, 17,-3,8};

    public static void main(String[] args) {

    Helper helper = new Helper();
        helper.countZeroOne(str);
        helper.maxElement(mas);
        
    }
    
    public int[][] countZeroOne(String str){

        char[] mas = str.toCharArray();
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < mas.length; i++){
            String s = String.valueOf(mas[i]);
            
           Integer t =  Integer.parseInt(s);
            
           if(t.equals(0)){
               countZero++;
           } else countOne++;
        }
        System.out.println(countZero + " " + countOne + " " + mas.length);
        
        return new int[countZero][countOne];

    }
    
    
    public int maxElement(int[] mas){
        
        int maxMlement = 0;
        for(int element: mas){
            if(maxMlement > element){
                continue;
            }
            else maxMlement = element;
        }
        System.out.println("max element:"  + maxMlement);
        return maxMlement;
    }
    //        System.out.println(TimeUnit.SECONDS.convert(10, TimeUnit.MILLISECONDS));
}
