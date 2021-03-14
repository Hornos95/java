import java.io.*;

public class Act1 {
    String muss = "";
    int count1 = 0;
    int count2 = 0;

    public String fileReader(String url, String start, String finish) {
        try {
            File file = new File(url);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.substring(0, start.length()).equals(start)) {
                        count1 = i;
                    }
                    if (line.substring(0, finish.length()).equals(finish)) {
                        count2 = i;
                    }

                }
                line = reader.readLine();
            }
            return muss= muss+line

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return muss ;
    }
}
