package w3d.database.entitys;

public class WrongInputException extends Exception {
    public WrongInputException(){
        super.printStackTrace();
    }
    public WrongInputException(String message){
        super(message);
    }
}
