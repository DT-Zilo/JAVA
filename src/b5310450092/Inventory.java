package b5310450092;

public class Inventory 
{
    private String name; // 6 point
    private int count; // 6 point
    int id; // 6 point

    public Inventory(String name,int count,int id)
    {
        this.id=id; // 2 point
        this.name = name; // 6 point
        this.count = count; // 6 point
    }

    public String outName() // 13 point
    {
        return this.name; 
    }

    public void editName(String name) // 13 point
    {
        this.name = name;
        System.out.println("To success.");
    }

    public void addCount(int countAdd) // 15 point
    {
        this.count = this.count+countAdd;
        System.out.println("This "+this.name+" Outstanding = "+this.count);
    }
    
    public int showCount() // 13 point
    {
        return this.count;
    }
}
