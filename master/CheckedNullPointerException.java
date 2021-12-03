package projectmaster;

public class CheckedNullPointerException extends Exception{
    public CheckedNullPointerException(){
        super("Trainer/Value cannot be null!");
    }
    public CheckedNullPointerException(String errorMessege){
        super(errorMessege);
    }
}
