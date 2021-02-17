package visitor;
import syntaxtree.Type;

public class Variable{

	private String variableName;
	private int type;
	public Variable(String name, int type ){

		variableName = name;
		this.type = type;
	}

	public String getVariableName(){
		return variableName;
	}
	public int getVariableType(){
		return type;
	}
}

