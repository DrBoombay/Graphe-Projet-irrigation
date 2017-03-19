package projectGraphe;

public class Sommet {
	protected String name;
	protected boolean flag;
	protected int x,y;
	
	public Sommet()
	{
		name = "unknown";
		flag = false;
		
	}
	
	public Sommet (String name, int x, int y)
	{
		this.name = name;
		this.flag = false;
		this.x=x;
		this.y=y;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Boolean getFlag(){
		return this.flag;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setFlag (boolean flag){
		this.flag = flag;
	}
	
}
