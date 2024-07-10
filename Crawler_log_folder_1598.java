package Leetcode;

public class Crawler_log_folder_1598 {
    public static void main(String[] args) {
        String[] logs={"d1/","d2/","./","d3/","../","d31/"};
        Crawler_log_folder_1598 ob=new Crawler_log_folder_1598();
        System.out.println(ob.minOperations(logs));
    }
    public int minOperations(String[] logs) {
        int count=0;
        for(String log: logs)
        {
            if(log.equals("../"))
            {
                if(count>0)
                {
                    count--;
                }
            }else if(!log.equals("./"))
            {
                count++;
            }
        }
        return count;
    }
}
