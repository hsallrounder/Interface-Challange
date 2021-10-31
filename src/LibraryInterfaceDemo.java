public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Test case #1");
        KidUsers t1_obj1 = new KidUsers(10,"Kids");
        KidUsers t1_obj2 = new KidUsers(18,"Fiction");
        t1_obj1.registerAccount();
        t1_obj2.registerAccount();
        t1_obj1.requestBook();
        t1_obj2.requestBook();
        System.out.println("");
        System.out.println("Test case #2");
        KidUsers t2_obj1 = new KidUsers(5,"Kids");
        KidUsers t2_obj2 = new KidUsers(23,"Fiction");
        t2_obj1.registerAccount();
        t2_obj2.registerAccount();
        t2_obj1.requestBook();
        t2_obj2.requestBook();
    }
}
