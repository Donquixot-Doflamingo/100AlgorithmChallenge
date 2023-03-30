package alphabeticShift;

public class alphabeticShift {

    public static String shift(String str){
        char[] ch = str.toCharArray();  

        for(int i = 0; i < ch.length; i++){
            int index = ch[i];
            index = index + 1;
            if(ch[i] == 'z'){
                index = 97;
            }
            ch[i] = (char)index;
        }

        String str1 = new String(ch);
        return str1;
    }
    public static void main(String[] args) {
        System.out.println(shift("zus"));
    }
}
