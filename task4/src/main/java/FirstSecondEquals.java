public class FirstSecondEquals {
    public String FirstSecondEquals(String fir, String sec){
        String a ="ok";
        String b= "ko";
        String c="";
        int count=0;
        for(int i=0;i<fir.length();i++){
            if(fir.substring(i,i+1).equals(sec.substring(i,i+1))){
                c=c+a;
            }
            if(fir.substring(i,i+1).equals("*")){
                count=fir.indexOf("*");
                if(fir.substring(0,count).equals(sec.substring(0,count)))c=c+a;
            }
            if(sec.substring(i,i+1).equals("*")){
                count=sec.indexOf("*");
                if(fir.substring(0,count).equals(sec.substring(0,count)))c=c+a;
            }
            return c;
        }
        return b;
    }
}
