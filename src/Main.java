public class Main {

    public static void main(String[] args) throws IncorrectEmailException, UnderAgeException {

        Human Tom = new Human();
        Tom.Age = 17;
        Tom.Email = "tom@gmail.com";
        Tom.Name = "Tom";
        Tom.accept();

        Human Mary = new Human();
        Mary.Age = 21;
        Mary.Email = "mary$gmail.com";
        Mary.Name = "Mary";
        Mary.accept();
    }

}
