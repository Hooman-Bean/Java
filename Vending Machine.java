import java.util.*;

public class vendingMachine {

    public static void main(String[] args) {
        int Bank = 0;
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        while (state) {
            System.out.println("Vending Machine Started.\n" + "Commands:\n"
                    + "d – dime\n"
                    + "q – quarter\n"
                    + "c – cancel\n"
                    + "D – Dispense \n" + "Note: command string must have a 'c' or 'D' after  'd's and/or 'q's added.\n" + "Enter 'end' to close vending machine.\n"
                    + "Enter a String: ");
            String cmd = sc.nextLine();
            //runvM(c);
            int curB = 0;
            if (cmd.equalsIgnoreCase("end")) {
                System.out.println("Vending Machine ended.");
                state = false;
                break;
            }
            if (curB < 50) {
                for (int i = 0; i <= cmd.length(); i++) {
                    if (cmd.charAt(i) == 'd') {
                        curB += 10;
                    } else if (cmd.charAt(i) == 'q') {
                        curB += 25;
                    } else if (cmd.charAt(i) == 'c') {
                        System.out.println("Funds Returned: " + curB);
                        curB = 0;
                        break;
                    } else if (cmd.charAt(i) == 'D' && curB < 50) {
                        System.out.println("Insufficient balance: " + "\n" + "Funds returned: " + curB);
                        curB = 0;
                        break;
                    } else if (cmd.charAt(i) == 'D' && curB >= 50) {
                        Bank += curB;
                        curB = 0;
                        System.out.println("Product Dispensed." + "\n" + "Cash deposited.");
                        break;
                    } else {
                        System.out.println(cmd.charAt(i) + "is invalid");
                    }
                }
                System.out.println("Current balance = " + curB + "\n" + "Amount in bank = " + Bank);

            }
        }
    }
}


//-----------------------------------------------------------------------------------------------------------------------------


import java.util.*; 
public class VendingM { 
static Scanner sc = new Scanner(System.in);
public static void main(String[] args)throws Exception {
String cString = "dqDC";
int[][] tt = {
{1, 3, 0, 0},  
{2, 4, 0, 0}, 
{4, 5, 0, 0}, 
{4, 6, 0, 0}, 
{5, 6, 0, 0}, 
{6, 6, 0, 0}, 
{6, 6, 0, 0}  
};
int state = 0;
while(true){
int cmd = cString.indexOf( sc.next().charAt(0) );
out(state,cmd);
state = tt[state][cmd];
}
}
static void out(int x, int y){
if(x==6 && y==2) System.out.println("Product dispensed, coins banked");
if(y==0) System.out.println("dime deposited");
if(y==1) System.out.println("quarter deposited");
if(y==3) System.out.println("Canceled: unbanked coins returned");
}
}