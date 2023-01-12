import java.util.Scanner;

public class Create_user {
     String accno;
     String name;
     long balance;

    public Create_user(){
        accno="0";
        name="N/A";
        balance=0;
    }

    public void Create_user(String ac, String na, long b) {
        accno = ac;
        name = na;
        balance = b;
    }
}
