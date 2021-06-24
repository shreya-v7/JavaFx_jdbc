abstract class Vehicle{
    
    protected int regno;
    protected int speed;
    protected String name;
    protected String color;
    public abstract void show(int r, int s, String n, String c, int rno);
    
}

class Bus extends Vehicle{
    private int routeno;
    
    
    public void show(int r, int s, String n, String c, int rno){
        this.regno = r;
        this.speed = s;
        this.name = n;
        this.color = c;
        this.routeno = rno;
        System.out.println(r+" "+s+" "+n+" "+c+" "+rno);
    }
    
}

class Car extends Vehicle{
    private int manuno;
    
    public void setmanu(int m){
        this.manuno = m;
    }
    
    public void show(int r, int s, String n, String c, int mno){
        this.regno = r;
        this.speed = s;
        this.name = n;
        this.color = c;
        this.manuno = mno;
        System.out.println(r+" "+s+" "+n+" "+c+" "+mno);
    }
    
}

public class abstract_inheritance
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Bus b = new Bus();
		Car c = new Car();
		
		b.show(10,10,"n","s",10);
		c.show(11,11,"m","d",10);
		
		
	}
}
