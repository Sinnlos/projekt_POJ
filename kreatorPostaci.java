package przebudzenie;

import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




@SuppressWarnings({ "unused" })
public class KreatorPostaci extends JFrame implements ActionListener
{

    private static final long serialVersionUID = 1L;
    /**
     * 
     */

    JButton button;
	JLabel lWyswietlInstrukcja1;
	JLabel lWyswietlInstrukcja2;
	JLabel lWyswietlOpisCzlowiek;
	JLabel lWyswietlOpisElf;
	JLabel lWyswietlOpisKrasnolud;
	JLabel lWyswietlOpisLotrzyk;
	JLabel lWyswietlOpisMag;
	JLabel lWyswietlOpisLowca;
	JLabel lWyswietlOpisWojownik;
	JLabel lWyswietlOpisZabojca;
	JLabel lWyswietlOpisZbrojmistrz;
	JLabel lWybierzRase;
	JLabel lWybierzProfesje1;
	JLabel lWybierzProfesje2;
	JLabel lImiePostaci;
	JTextField tImiePostaci;
	String imiePostaci;
	ButtonGroup bgProfesja1;
	ButtonGroup bgProfesja2;
	JRadioButton rbMag1;
	JRadioButton rbLowca1;
	JRadioButton rbWojownik1;
	JRadioButton rbZabojca1;
	JRadioButton rbZbrojmistrz1;
	JRadioButton rbMag2;
    JRadioButton rbLowca2;
    JRadioButton rbWojownik2;
    JRadioButton rbZabojca2;
    JRadioButton rbZbrojmistrz2;
    @SuppressWarnings("rawtypes")
    JComboBox cbRasa;
    static Postac postac;
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
    public KreatorPostaci()
	{
		setSize(1200,700);
		setTitle("Przebudzenie mocy - kreator postaci");
		setLayout(null);
		
		button = new JButton("Stwórz postać");
		button.setBounds(1025, 615, 150, 40);
		add(button);
		button.addActionListener(this);
		
		lWyswietlInstrukcja1 = new JLabel("Wybierz jedną z poniższych ras:");
        lWyswietlInstrukcja1.setBounds(10, 10, 350, 40);
        add(lWyswietlInstrukcja1);
		
		lWyswietlOpisCzlowiek = new JLabel("- Czlowiek nie ma umiejętności rasowych.");
		lWyswietlOpisCzlowiek.setBounds(30, 40, 350, 40);
		add(lWyswietlOpisCzlowiek);
		
		lWyswietlOpisElf = new JLabel("- Elf posiada dwie specjalne umiejętnosci: widzenie w ciemności oraz super zręczność.");
        lWyswietlOpisElf.setBounds(30, 70, 700, 40);
        add(lWyswietlOpisElf);
        
        lWyswietlOpisKrasnolud = new JLabel("- Krasnolud posiada dwie specjalne umiejętnosci: widzenie w ciemności oraz super wytrzymałość.");
        lWyswietlOpisKrasnolud.setBounds(30,100, 725, 40);
        add(lWyswietlOpisKrasnolud);
        
        lWyswietlOpisLotrzyk = new JLabel("- Łotrzyk posiada dwie specjalne umiejętnosci: latanie oraz wrażliwość na obrażenia.");
        lWyswietlOpisLotrzyk.setBounds(30, 130, 700, 40);
        add(lWyswietlOpisLotrzyk);
        
        lWyswietlInstrukcja2 = new JLabel("Wybierz dwie z poniższych profesji:");
        lWyswietlInstrukcja2.setBounds(10, 190, 350, 40);
        add(lWyswietlInstrukcja2);
        
        lWyswietlOpisMag = new JLabel("- Mag posiada dwie specjalne umiejętnosci: czarowanie oraz eliksiry.");
        lWyswietlOpisMag.setBounds(30, 220, 700, 40);
        add(lWyswietlOpisMag);
        
        lWyswietlOpisLowca = new JLabel("- Łowca posiada dwie specjalne umiejętnosci: skradanie oraz strzelectwo.");
        lWyswietlOpisLowca.setBounds(30, 250, 700, 40);
        add(lWyswietlOpisLowca);
        
        lWyswietlOpisWojownik = new JLabel("- Wojownik posiada cztery specjalne umiejętnosci: walka wręcz, walka mieczem, walka toporem oraz walka włócznią.");
        lWyswietlOpisWojownik.setBounds(30, 280, 850, 40);
        add(lWyswietlOpisWojownik);
        
        lWyswietlOpisZabojca = new JLabel("- Zabójca posiada trzy specjalne umiejętnosci: skradanie, trucizny oraz walka wręcz.");
        lWyswietlOpisZabojca.setBounds(30, 310, 800, 40);
        add(lWyswietlOpisZabojca);
        
        lWyswietlOpisZbrojmistrz = new JLabel("- Zbrojmistrz posiada jedną specjalną umiejętnosć: naprawa ekwipunku.");
        lWyswietlOpisZbrojmistrz.setBounds(30, 340, 700, 40);
        add(lWyswietlOpisZbrojmistrz);
        
//-------------------------------------------------------------------------------------------------
        
        lWybierzRase = new JLabel("Wybierz rasę");
        lWybierzRase.setBounds(60, 430, 200, 40);
        add(lWybierzRase);
        
        lWybierzProfesje1 = new JLabel("Wybierz pierwszą profesję");
        lWybierzProfesje1.setBounds(300, 430, 200, 40);
        add(lWybierzProfesje1);
        
        lWybierzProfesje2 = new JLabel("Wybierz drugą profesję");
        lWybierzProfesje2.setBounds(640, 430, 350, 40);
        add(lWybierzProfesje2);
        
        lImiePostaci = new JLabel("Wpisz imie postaci");
        lImiePostaci.setBounds(990, 430, 350, 40);
        add(lImiePostaci);
        
        tImiePostaci = new JTextField("");
        tImiePostaci.setBounds(985, 480, 150, 25);
        add(tImiePostaci);
        
        cbRasa = new JComboBox();
        cbRasa.setBounds(35, 480, 150, 30);
        cbRasa.addItem("Człowiek");
        cbRasa.addItem("Elf");
        cbRasa.addItem("Krasnolud");
        cbRasa.addItem("Łotrzyk");
        add(cbRasa);
        
        bgProfesja1 = new ButtonGroup();
        
        rbMag1 = new JRadioButton("Mag", true);
        rbMag1.setBounds(300, 480, 150, 40);
        bgProfesja1.add(rbMag1);
        add(rbMag1);
        rbMag1.addActionListener(this);
        
        rbLowca1 = new JRadioButton("Łowca", false);
        rbLowca1.setBounds(300, 510, 150, 40);
        bgProfesja1.add(rbLowca1);
        add(rbLowca1);
        rbLowca1.addActionListener(this);
        
        rbWojownik1 = new JRadioButton("Wojownik", false);
        rbWojownik1.setBounds(300, 540, 150, 40);
        bgProfesja1.add(rbWojownik1);
        add(rbWojownik1);
        rbWojownik1.addActionListener(this);
        
        rbZabojca1 = new JRadioButton("Zabójca", false);
        rbZabojca1.setBounds(300, 570, 150, 40);
        bgProfesja1.add(rbZabojca1);
        add(rbZabojca1);
        rbZabojca1.addActionListener(this);
        
        rbZbrojmistrz1 = new JRadioButton("Zbrojmistrz", false);
        rbZbrojmistrz1.setBounds(300, 600, 150, 40);
        bgProfesja1.add(rbZbrojmistrz1);
        add(rbZbrojmistrz1);
        rbZbrojmistrz1.addActionListener(this);
        
        bgProfesja2 = new ButtonGroup();
        
        rbMag2 = new JRadioButton("Mag", true);
        rbMag2.setBounds(640, 480, 150, 40);
        bgProfesja2.add(rbMag2);
        add(rbMag2);
        rbMag2.addActionListener(this);
        
        rbLowca2 = new JRadioButton("Łowca", false);
        rbLowca2.setBounds(640, 510, 150, 40);
        bgProfesja2.add(rbLowca2);
        add(rbLowca2);
        rbLowca2.addActionListener(this);
        
        rbWojownik2 = new JRadioButton("Wojownik", false);
        rbWojownik2.setBounds(640, 540, 150, 40);
        bgProfesja2.add(rbWojownik2);
        add(rbWojownik2);
        rbWojownik2.addActionListener(this);
        
        rbZabojca2 = new JRadioButton("Zabójca", false);
        rbZabojca2.setBounds(640, 570, 150, 40);
        bgProfesja2.add(rbZabojca2);
        add(rbZabojca2);
        rbZabojca2.addActionListener(this);
        
        rbZbrojmistrz2 = new JRadioButton("Zbrojmistrz", false);
        rbZbrojmistrz2.setBounds(640, 600, 150, 40);
        bgProfesja2.add(rbZbrojmistrz2);
        add(rbZbrojmistrz2);
        rbZbrojmistrz2.addActionListener(this);
        
	}


public static void main(String args [])
{
		KreatorPostaci kreator;

		
		kreator = new KreatorPostaci();
		kreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kreator.setVisible(true);
		
		//postac = new Elf();
		//postac = new Wojownik(postac);
		//postac = new Lowca(postac);
		
		//System.out.println(postac.getDescription() + postac.opis());
}
	

//dispose(); - wyjscie z programu

	
	public void actionPerformed(ActionEvent e) 
{
	    imiePostaci = tImiePostaci.getText(); 
	    
	    
		Object zrodlo = e.getSource();
		
		if(zrodlo==button)
		{
		    if(cbRasa.getSelectedItem().equals("Człowiek"))
		    {
		        postac = new Czlowiek();
		    }
		    
		    if(cbRasa.getSelectedItem().equals("Elf"))
		    {
		        postac = new Elf();
		    }
		    
		    if(cbRasa.getSelectedItem().equals("Krasnolud"))
		    {
		        postac = new Krasnolud();
		    }
		    
		    if(cbRasa.getSelectedItem().equals("Łotrzyk"))
		    {
		        postac = new Lotrzyk();
		    }
		    
		    if(bgProfesja1.equals(rbMag1))
		    {
		        postac = new Mag(postac);
		    }
		    
		    if(bgProfesja1.equals(rbLowca1))
            {
		        postac = new Lowca(postac);
            }
		    
		    if(bgProfesja1.equals(rbWojownik1))
            {
		        postac = new Wojownik(postac);
            }
		    
		    if(bgProfesja1.equals(rbZabojca1))
            {
		        postac = new Zabojca(postac);
            }
		    
		    if(bgProfesja1.equals(rbZbrojmistrz1))
            {
		        postac = new Zbrojmistrz(postac);
            }
		    
		    if(bgProfesja2.equals(rbMag2))
            {
		        postac = new Mag(postac);
            }
		    
		    if(bgProfesja2.equals(rbLowca2))
            {
		        postac = new Lowca(postac);
            }
		    
		    if(bgProfesja2.equals(rbWojownik2))
            {
		        postac = new Wojownik(postac);
            }
		    
		    if(bgProfesja2.equals(rbZabojca2))
            {
		        postac = new Zabojca(postac);
            }
		    
		    if(bgProfesja2.equals(rbZbrojmistrz2))
            {
		        postac = new Zbrojmistrz(postac);
            }
		}
		
        PrintWriter zapis;
       // File dane = new File(imiePostaci + ".txt");
       // if(dane.exists()){
       // JOptionPane.showMessageDialog(this, "Zmień nazwę postaci.");
       // }
       // else{
            try {
                zapis = new PrintWriter(imiePostaci + ".txt");
                zapis.println("Nazwa: " + imiePostaci);
                zapis.println("Rasa: " + postac.getRasa());
                zapis.println("Profesja: " + postac.getProfesja());
                zapis.println("Umiejetnosci: " + postac.getZdolnosc() + postac.getUmiejetnosc());
                zapis.close();
                JOptionPane.showMessageDialog(null, "Postać została utworzona.");
                } 
            catch (FileNotFoundException e1) {
             
                JOptionPane.showMessageDialog(null, "Utworzenie postaci nieudane. Spróbuj ponownie.");
                e1.printStackTrace();
		   
           
	}}}
