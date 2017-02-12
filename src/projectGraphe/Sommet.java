package projectGraphe;

class Sommet {
	protected String name;
	
	public Sommet()
	{
		name = "unknown";
		
	}
	
	public Sommet (String _name)
	{
		name = _name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
