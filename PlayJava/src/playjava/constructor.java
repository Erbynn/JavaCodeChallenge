
package playjava;       //dir that it s found inside

public class constructor {      //allows to initialize var instantly
    private String name;        
    
    public constructor(String dzin){        //has name of class and done same as that of the setFxn, thus allowing initializing var as soon as it's object is created
        name=dzin;
    }
    public String getName(){        //since contructor assumed and treated as setFx, get fxn MUST not be left out
        return name;        // get the return....ie, retrieving
    }
    public void message(){      //fxn for sms must not be left out 
        System.out.printf("the name of female bestie was %s \n", getName() );       //printf is used together with %s and \n for next line 
    }
}
