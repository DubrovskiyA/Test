
public class Task2 {
    public static void main(String[] args) {
        String s="Hello";
        char[] chars=s.toCharArray();
        char buffer=chars[0];
        for (int i =1;i<chars.length;i++){
            if (buffer==chars[i]){
                System.out.println("Повторяющийся символ: "+chars[i]);
            }
            buffer=chars[i];
        }
    }

}
