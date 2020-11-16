// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment12;

import java.util.ArrayList;
import java.util.List;

public class HelperClass implements Runnable {
	private List<String> words;

    public HelperClass(List<String> words) {
        this.words = words;
    }

    //function which replaces <>
    public static void ReplaceHTML(List<String> tws1) {        
        System.out.println("Replacing html");
        
        ArrayList<String> replaced = new ArrayList<String>();
        for (String s : tws1) {
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) == '<') && !(s.charAt(i) == '>')) {
                    replaced.add("" + s.charAt(i));
                }
            }
        }
    }

	@Override
	public void run() {
        HelperClass.ReplaceHTML(this.words);
	}
}
