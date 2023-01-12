import java.util.Scanner;
public class main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        User C[] = new User[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new User();
            System.out.print("Enter Account No: ");
            String ac = sc.next();
            System.out.print("Enter Name: ");
            String na = sc.next();
            System.out.print("Enter Balance: ");
            long b = sc.nextLong();
            C[i].Create_user(ac,na,b);
        }

            System.out.println("\n ***ATM System***");
            System.out.print("Enter Account no. : ");
            String ac_no = sc.next();
            boolean found = false;
            for (int i = 0; i < C.length; i++) {
                found = C[i].search(ac_no);
                if (found) {
                    System.out.println(" 1. Deposit the amount \n 2. Withdraw the amount \n 3.Exit ");
                    System.out.println("Enter your choice: ");
                    int ch;
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            int amt;
                            System.out.println("Enter the amount you want to deposit: ");
                            amt = sc.nextInt();
                            C[i].deposit(amt);
                            System.out.println("Done.......");
                            break;
                        case 2:
                            int amt2;
                            System.out.println("Enter the amount you want to withdraw: ");
                            amt2 = sc.nextInt();
                            C[i].withdraw(amt2);
                            System.out.println("Done.......");
                            break;
                        case 3:
                            System.out.println("M3 EL SLAMA...");
                            break;
                    }
                    break;

                }
            }
            if (!found) {
                System.out.println("Account doesn't exist..!!");
            }


        }

    }





