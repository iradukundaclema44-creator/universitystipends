public class Graduatestudent extends student {
  private double taHours; 
  private double yearlyGrant; 
  public Graduatestudent(double taHours, double yearlyGrant) {
     this.taHours = taHours; 
     this.yearlyGrant = yearlyGrant;
     }
      @Override public double calculateMonthlyStipend() {
         return 1200 + (taHours * 25) + (yearlyGrant / 12); 
        }
}
