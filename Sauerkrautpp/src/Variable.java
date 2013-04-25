package src;

public class Variable {
	private int index;
	private Type type;
	
	public Variable(int index, Type type) {
		this.index = index;
		this.type = type;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Type getType() {
		return type;
	}
	public void setTyp(Type type) {
		this.type = type;
	} 
}