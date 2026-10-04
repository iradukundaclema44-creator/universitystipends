public class Undergraduatestudent extends student {
  private double gpa;

  public Undergraduatestudent(double gpa) {
    this.gpa = gpa;

  }

  @Override
  public double calculateMonthlyStipend() {
    double stipend = 500;
    if (gpa > 3.5) {
      stipend += 150;
    }
    return stipend;
  }
}
