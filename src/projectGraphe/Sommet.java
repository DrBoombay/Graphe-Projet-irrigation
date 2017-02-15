package projectGraphe;

class Sommet {
	protected String name;
	protected boolean flag;
	
	public Sommet()
	{
		name = "unknown";
		flag = false;
		
	}
	
	public Sommet (String _name)
	{
		name = _name;
		flag = false;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Boolean getFlag(){
		return this.flag;
	}
	
	public void setName(String _name){
		this.name = _name;
	}
	
	public void setFlag (boolean _flag){
		this.flag = _flag;
	}
	
}
