import java.util.*;

public class exp3_4 {
    public static void main(String[] args) {
        System.out.println("Enter The String : ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        StringBuffer str = new StringBuffer(user);

        char temp;
        for (int i = 0; i < user.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                temp = str.charAt(i);
                temp = (char) (temp - 32);
                str.setCharAt(i, temp);

            }
        }
        System.out.println(str);
        sc.close();
    }
}
