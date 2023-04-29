package assignment;

import java.util.ArrayList;
import java.util.List;

public class haha {
    public static List<String> preprocessDate(List<String> dates) {
        List<String> list=new ArrayList<>();

        for(String s:dates){
            StringBuffer s1=new StringBuffer();
            String[] s2=s.split(" ");
            s1.append(s2[2]).append("-");


            String month = s2[1];
            switch (month) {
                case "Jan":
                    s1.append("01");
                    break;
                case "Feb":
                    s1.append("02");
                    break;
                case "Mar":
                    s1.append("03");
                    break;
                case "Apr":
                    s1.append("04");
                    break;
                case "May":
                    s1.append("05");
                    break;
                case "June":
                    s1.append("06");
                    break;
                case "Jul":
                    s1.append("07");
                    break;
                case "Aug":
                    s1.append("08");
                    break;
                case "Sep":
                    s1.append("09");
                    break;
                case "Oct":
                    s1.append("10");
                    break;
                case "Nov":
                    s1.append("11");
                    break;
                case "Dec":
                    s1.append("12");
                    break;
                default:
                    System.out.println("输入的月份有误！");
                    break;
            }
            StringBuffer sb = new StringBuffer();
            char c = s2[0].charAt(0);
            char c1=s2[1].charAt(1);
            if(Character.isDigit(c)){
                sb.append(c);
            }
            if(Character.isDigit(c1)){
                sb.append(c1);
            }
            String s3 = sb.toString();
            String s4 = s1.append("-").append(s3).toString();
            list.add(s4);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> commands=new ArrayList<>();
        commands.add("clear");
        commands.add("open firefox");
        commands.add("clear");
        commands.add("clear");
        commands.add("clear");
        commands.add("clear");
        commands.add("clear");
        commands.add("clear");



    }
}
