package visitor;
import java.util.*;

public class SymbolTable{
	public Hashtable table;
	


	public SymbolTable(){
		table = new Hashtable();
		
	}
	public boolean addClass(ClassSymbolTable m){
		//System.out.println(m.getMethodName().intern());
		if(table.get(m.getClassName().intern())==null){
			
			table.put(m.getClassName().intern(),m);
			return true;
		}
		else{
			return false;
		}
	}
    public  ClassSymbolTable get(String s){
		if((table.get(s.intern()) == null)){
			System.out.println("Class  not declared : " +s);
			//System.exit(1);
		}
			 return (ClassSymbolTable)table.get(s.intern());
	}
    public int getSize(){
    	return this.table.size();
    }
	/*public  ClassSymbolTable get(Object o){
		if((table.get(o)) == null){
			System.out.println("Identifier not declared : " +o);
			//System.exit(1);
		}
		 return(ClassSymbolTable)table.get(o);
	}*/
    
	public java.util.Enumeration keys(){
		return table.elements();
	}
	public Hashtable getTable(){
		return this.table;
	}
 public void getString(){
   	     
   	     /*
   	   for (Enumeration e = table.elements();  e.hasMoreElements() ;) {
             ClassSymbolTable cst = (ClassSymbolTable)e.nextElement();   
             System.out.println(e.nextElement());   	   	 
         for(Enumeration e1 = cst.classFieldTable.elements();e1.hasMoreElements() ;){
   	   		 System.out.println(e1.nextElement());
   	    	   	}
   	     for(Enumeration e2 = cst.classMethodTable.elements();e2.hasMoreElements(); ){
	   		 MethodSymbolTable mst = (MethodSymbolTable)e2.nextElement();
	         System.out.println(mst.getMethodType()+mst.getMethodName());
	         for(Enumeration e3 = mst.methodParamTable.elements();e3.hasMoreElements() ;){
	   	   		 System.out.println(e3.nextElement());
	   	       }
	         for(Enumeration e4 = mst.methodLocalTable.elements();e4.hasMoreElements() ;){
	   	   		 System.out.println(e4.nextElement());
	   	       }
   	   	
     }
   	  	  
   	  
   	*/
     //int symsize=table.size();
   //    for(Enumeration e =this.table.keys();e.hasMoreElements();){  
     	//ClassSymbolTable cst =this.get(e.nextElement().toString());
       // System.out.println(e.nextElement());
 //      }
        
}
}
