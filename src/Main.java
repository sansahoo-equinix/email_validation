public class Main {
    public static void main(String[] args) {
        App address = new App("123 Main St", "Anytown", "CA", "12345");

        Person sanskar = new Person("Thiery", "thiery@gmail.com", "8833445566", 533000, null, address);
        Person aditya = new Person("Henry", "henry@gmail.com", "5566334455", 330000, sanskar, address);
        Person yuvraj = new Person("Saka", "saka@gmail.com", "0070070070", 300000, aditya, address);

        yuvraj.printHierarchy();
        aditya.isEmailValid();
        yuvraj.isPhoneValid();
    }
}
