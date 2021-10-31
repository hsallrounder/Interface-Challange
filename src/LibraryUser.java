public interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUsers implements LibraryUser{
    int age;
    String bookType;

    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age<12)
            System.out.println("You have successfully registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    @Override
    public void requestBook() {
        if(bookType=="Kids")
        System.out.println("Book Issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age>12)
            System.out.println("You have successfully registered under an Adult Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    @Override
    public void requestBook() {
        if(bookType=="Fiction")
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}