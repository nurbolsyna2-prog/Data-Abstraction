public class videoLecture extends ContentImage {
    private String quality;
    public videoLecture(String title,int year,int durationMinutes,String quality){
super(title,year,durationMinutes);
this.quality=(quality);
}
    @Override
    public double getLicenseCost(int currentYear) {
        int age = currentYear - getYear();
        int ageFactor = (age <= 2) ? 5 : 2;
        return 0.05 * getDurationMinutes() + ageFactor;
}
}