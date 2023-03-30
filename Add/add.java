// package Add;

public class add{

    public static int addValue(int ... a){
        int total = 0;
        for(int num : a){
            total += num;
        }
        return total;
    }

    public static int addValue(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = addValue(2,3,45,6,7);
        System.out.println(a);
    }
}