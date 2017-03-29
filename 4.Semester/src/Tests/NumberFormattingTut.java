package Tests;


import com.sun.org.apache.xpath.internal.operations.Number;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormattingTut {
    public static void main(String[] args){
        NumberFormat geld = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat prozent = NumberFormat.getPercentInstance();
        System.out.println(geld.format(20000));
        System.out.println(prozent.format(20000));
        System.out.println(NumberFormat.getInstance(Locale.GERMANY).format(20.10f));

        NumberFormat nachkommata = NumberFormat.getInstance();
      //  nachkommata.getMaximumFractionDigits();//default: die 3 zahlen NACH dem komma werden angezeigt.
        nachkommata.setMaximumFractionDigits(2); //die ersten 5 zahlen NACH dem komma werden angezeigt.(aufgerundet)
       System.out.println(nachkommata.getMaximumFractionDigits());
        System.out.println(nachkommata.format(226.75999));

    }
}
