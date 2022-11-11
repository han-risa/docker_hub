import java.util.Scanner;

public class sample_code {
 static double a,b,
  kelvin,
  Fahrenheit,
  Rankine,
  Delisle,
  Newton,
  Reaumur,
  Romer;
 static String C; 
 
    public static void main(String[] args) {
     
      sample_code ks = new sample_code();
   
      System.out.print("masukkan nilai Suhu Dalam Celcius : ");
      Scanner s = new Scanner(System.in);
      C = s.next();//menangkap nilai celcius 
      a=Double.parseDouble(C);//merubah nilai c yang String menjadi double
      
      ks.konversi();
      ks.cetak();
     
     }
    void cetak(){
      System.out.println("");
      System.out.println(a+"°C =");
      System.out.println(kelvin +"°K");
      System.out.println(Fahrenheit +"°F");
      System.out.println(Rankine +"°Ra");
      System.out.println(Delisle +"°De");
      System.out.println(Newton +"°N");
      System.out.println(Reaumur +"°Ré");
      System.out.println(Romer +"°Rø");
    }
    void konversi(){
      kelvin = a + 273.15;
      Fahrenheit = a * 1.8 + 32;
      Rankine = 1.8 * a + 491.67;
      Delisle = (100 - a) * 1.5;
      Newton = a * 33/100;
      Reaumur = a * 0.8;
      Romer = a * 21/40 + 7.5;
    }

}