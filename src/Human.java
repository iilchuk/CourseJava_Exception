public class Human {

    public String Name;
    public int Age;
    public String Email;

    void accept() throws UnderAgeException, IncorrectEmailException {

        if (Age<18){
            throw new UnderAgeException("Your age under 18");
        }else if (!Email.contains("@")){
            throw new IncorrectEmailException("Your email is incorrect");
        }

    }

}

class UnderAgeException extends Exception {

    UnderAgeException(String message){
        super(message);
    }

}

class IncorrectEmailException extends Exception {

    IncorrectEmailException(String message){
        super(message);
    }

}
