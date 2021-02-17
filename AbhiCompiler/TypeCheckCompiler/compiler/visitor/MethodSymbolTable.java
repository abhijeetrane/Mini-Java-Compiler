package visitor;
import syntaxtree.Type;
import java.util.*;
public class MethodSymbolTable{
	public Hashtable methodVarTable;
	public ArrayList paramlist = new ArrayList();
	public ArrayList localist = new ArrayList();
	public String methodName;
	public Type methodType;
	
	
	public MethodSymbolTable(String name, Type type){
		methodVarTable = new Hashtable();
		
		methodName = name;
		methodType = type;
	}
	public boolean addVar(Variable v){
		if(methodVarTable.get(v.getVariableName().intern())==null){
			//table.put(v.getVariableName().intern(),v.getVariableName());
			methodVarTable.put(v.getVariableName().intern(),v);
	        			return true;
		}
		else{
			return false;
		}
	}
	public Variable getVar(String varName){
		if((methodVarTable.get(varName.intern()) == null)){
			System.out.println("Identifier not declared : " +varName );
		    	
			//System.exit(1);
		}
		return (Variable)methodVarTable.get(varName.intern());
	}
		
	
	public String getMethodName(){
		return methodName;
	}
	public Type getMethodType(){
		return methodType;
	}
	//public MethodHolder getMethod(){
	//	return this;
	//}
}

