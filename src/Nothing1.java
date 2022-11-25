public class Nothing1 {
    public static void main(String[] args) {
        System.out.println(textGrade(-1));}
        static String textGrade(int grade){
            String strOut = "";
            if (grade == 0)
            strOut = "не оценено";
            else if (grade>=1 && grade<=20)
                strOut = "очень плохо";
            else if (grade>=21 && grade<=40)
                strOut = "плохо";
            else if (grade>=41 && grade<=60)
                strOut = "удовлетворительно";
                else if (grade>=61 && grade<=80)
                strOut = "хорошо";
                else if (grade>=81 && grade<=100)
                strOut = "отлично";
                else strOut = "не определено";

            return strOut;
        }

}
