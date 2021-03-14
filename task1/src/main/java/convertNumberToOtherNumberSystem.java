import java.io.IOException;
import java.math.BigInteger;

public class convertNumberToOtherNumberSystem {

    public BigInteger convertNumber(int nb, String base ) throws IOException {
        int count=0;
        for(int i=0;i<base.length();i++)count++;
        BigInteger conclusion= new BigInteger(BigInteger.valueOf(nb).toString(count));
        return conclusion;
    }


}
