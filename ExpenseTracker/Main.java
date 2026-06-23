package ExpenseTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        int value=0;
        Manager obj=new Manager();
 
        while(value != 5)
       {
        
        System.out.println("1.Add Expense");
        System.out.println("2.Delete Expense");
        System.out.println("3.view Expense");
        System.out.println("4.Generate report");
        System.out.println("5.exist");
        value=sc1.nextInt();
        switch (value) {
            case 1:
                obj.addExpense();
                break;
            case 2:
                obj.deleteExpense();
                break;
            case 3:
                obj.viewExpense();
                break;
            case 4:
                obj.generateReport();
                break;
            default:
                break;
        }

    }
    }
}
