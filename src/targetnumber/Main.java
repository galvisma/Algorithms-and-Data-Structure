package targetnumber;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 6, 5};
        int target = 9;

        Solution numbers = new Solution();
        int[] index = numbers.findTarget(array,target);
        System.out.println("Los indices son: " + index[0] + " , " + index[1]);
    }

}
