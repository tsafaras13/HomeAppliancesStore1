import java.io.Serializable;
public class Oven implements Serializable {

    public String OnomaKataskeuasth;
    public String OnomaSyskeuhs;
    public String Tupos;
    public int Mikos;
    public int Ipsos;
    public int Vathos;
    public int Katanalwsh;

    public static int counter = 0;
    // Constructor
    public Oven(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , int Mikos , int Ipsos , int Vathos , int Katanalwsh){

        this.OnomaKataskeuasth = OnomaKataskeuasth;
        this.OnomaSyskeuhs = OnomaSuskeuhs;
        this.Tupos = TuposSuskeuhs;
        this.Mikos = Mikos;
        this.Ipsos = Ipsos;
        this.Vathos = Vathos;
        this.Katanalwsh = Katanalwsh;
        counter++;
    }
    public static String Suskeuh(){
        return "Oven: " + counter;
    }
}
