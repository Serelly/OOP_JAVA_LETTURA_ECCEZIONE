import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //definisce una variabile di tipo String chiamata filename e le assegna il percorso del file "src/data.txt"
        String filename = "src/data.txt";

        assert filename != ""; //verifico che il nome del file non sia vuoto

        //avvio il processo di lettura in un blocco try-catch
        try{
            Leggi.leggi(filename);  //metodo chiamato per leggere un file
        }catch (FileNotFoundException e){   //se il file non viene trovato
//
//      chiamata al metodo che stampa lo Strack Trace, ovvero la sequenza di metodi chiamati che ha portato al lancio dell'eccezione.
//            e.printStackTrace();
            System.out.println("File non trovato, occhio.");
        }catch(MalformedFile e){    //gestione di un'eccezione personalizzata
            System.out.println(e.getMessage());
            //l messaggio dell'eccezione (e.getMessage()) viene stampato.
            // Questo consente di fornire dettagli specifici sull'errore, ad esempio, se il contenuto del file non rispetta un formato atteso.
        }
    }
}
