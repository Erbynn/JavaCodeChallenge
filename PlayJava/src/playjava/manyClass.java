package playjava;

public class manyClass {
    private String girlName;    //aim is to set priv var accessible by only fxns of this class 
    public void setName(String name){       //set is for = ...simply, set equal parameter....has parameter but no return
        girlName=name;      //name=girlName wont work....it is priv=pub
    }
    public String getName(){        //get is to retrieve back....has return type but no parameter cus of no = for setting
        return girlName;        //since retrieving after setting, use return
    }
    public void message(){      //method for output
        System.out.printf("the name of your girl is %s ", getName());       //printf not println....printf for printfxn with c commands
    }
}

// in sum, private var...set...get...output