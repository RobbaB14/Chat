import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Listener implements ListSelectionListener {
/*	Ko v seznamu kliknemo na prijavljenjega uporabnika,
	ga shranimo v String receiver in popravimo napis pred vnosno vrstico. 
	(to je potrebno zato, ker se seznam stalno posodablja).*/
	    public void valueChanged(ListSelectionEvent e) {
	    	Gui.setReceiver();
	    	Gui.printReceiver();
	    }

}
