import java.util.HashMap;
import java.util.Map;

public class Scope {
	private static int index = 0;
	private Scope parent;
	private Map<String, Variable> variables;
	
	public Scope(Scope parent) {
		variables = new HashMap<String, Variable>();
		this.parent = parent;
	}
	
	public Variable getVariable(String name) {
		Variable result = variables.get(name);
		if (result == null) {
			if (parent != null) {
				result = parent.getVariable(name);
			}
		}
		return result;
	}
	
	public Scope getParent() {
		return this.parent;
	}
	
	public boolean contains(String name) {
		return this.variables.containsKey(name);
	}
	
	public void put(String name, Type type) {
		this.variables.put(name, new Variable(index, type));
		++index;
	}
}
