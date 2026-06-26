import java.util.*;


public class Expense implements Comparable<Expense>{
    
    private int amount;
    private String category;
    private String date;
    private String description;
    //public ArrayList<Integer> expense=new ArrayList<>();
    public Expense(int amount,String category,String date,String description){
        if(amount<0){
            throw new IllegalArgumentException("Value should be Postive");
        }
      this.amount=amount;
      this.category=category;
      this.date=date;
      this.description=description;
    }
    public int getAmount(){
        return amount;
    }
    public String getCategory(){
        return category;
    }
    public String getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    @Override
    public int compareTo(Expense other) {
        return other.date.compareTo(this.date);
    }
    public static Comparator<Expense> sortByAmount(){
        return (e1,e2) -> Integer.compare(e2.amount,e1.amount);
    }
    
    
}