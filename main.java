public class main {
    public static void main(String[] args) {
        student undergraduate = new Undergraduatestudent(3.8);
        student graduate = new Graduatestudent(20, 2400);
        System.out.println("Undergraduate Stipend: $" + undergraduate.calculateMonthlyStipend());
        System.out.println("Graduate Stipend: $" + graduate.calculateMonthlyStipend());
    }
}
