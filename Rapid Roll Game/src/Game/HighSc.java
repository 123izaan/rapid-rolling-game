package Game;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighSc{
	int hsc;
	BufferedReader br;
	FileInputStream fis;
	String sths;
	public String getHighScore()  throws IOException{
		fis = new FileInputStream("highscore.txt");
	    br = new BufferedReader(new InputStreamReader(fis));
	    sths = br.readLine();
	    fis.close();
	    return sths;
	    }
 }