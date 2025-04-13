package Enum_tutorial;

public enum Day {
    SUNDAY(1, "Sunday"), MONDAY(2, "Monday"), TUESDAY(3, "Tuesday"), WEDNESDAY(4, "Wednesday"), THURSDAY(5,"Thursday"), FRIDAY(6,"Friday"), SATURDAY(7,"Saturday");
    int dayNo;
    String dayName;
    private Day(int dayNo , String dayName){
        this.dayNo = dayNo;
        this.dayName = dayName;
    }
    public int getDayNo(){
        return dayNo;
    }
    public String getDayName(){
        return dayName;
    }

}
