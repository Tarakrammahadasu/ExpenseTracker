package ExpenseTracker;
import java.util.*;

public class Manager {
     int totalExpense;
     ArrayList<Expense> expense=new ArrayList<>();
      Scanner sc=new Scanner(System.in);
    public void addExpense(){
        System.out.print("Amount:");
        int amount=sc.nextInt();
        sc.nextLine();
        System.out.print("Category:");
        String category=sc.nextLine();
        System.out.print("Date(YYYY-MM-DD):");
        String date=sc.nextLine();
        System.out.print("Description");
        String description=sc.nextLine();
        Expense obj= new Expense(amount,category,date,description);
        expense.add(obj);
        totalExpense+= amount;

    }

    public void deleteExpense(){
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to remove the Expense:");
        int idx=sc.nextInt();
        if(idx>=0 && idx<expense.size()){
            Expense removed =expense.remove(idx);
            System.out.println(removed.getCategory()+" of "+ removed.getAmount() + "removed");
            totalExpense-=removed.getAmount();
        }else{
            System.out.println("Invalid index");
        }
       
    }

    public void viewExpense(){
        Collections.sort(expense);
        displayExpenses(expense);
    }
    public void generateReport(){
        ArrayList<Expense> sorted = new ArrayList<>(expense);
        Collections.sort(sorted,Expense.sortByAmount());
        displayExpenses(sorted);
    }

    private void displayExpenses(List<Expense> expenses) {
         System.out.println("Category\tAmount\tDate\tDescription");
            for (Expense e : expenses) {
                   System.out.printf("%s\t%d\t%s\t%s%n", e.getCategory(), e.getAmount(), e.getDate(), e.getDescription());
            }
    } 

    
}
