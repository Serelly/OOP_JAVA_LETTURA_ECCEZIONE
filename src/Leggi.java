import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leggi {
    /**
     * Metodo leggi dove vengono lanciate l'eccezione FileNotFoundException se il file non è trovato
     * e l'eccezione personalizzata MalformedFile che segnala problemi di formattazione
     * @param filename
     * @throws FileNotFoundException
     * @throws MalformedFile
     */
    public static void leggi(String filename) throws FileNotFoundException, MalformedFile {
        FileInputStream fin = new FileInputStream(filename);    //apre il file per la lettura
        Scanner in = new Scanner(fin);  //Legge il file come input
        in.useDelimiter(","); //imposta la virgola , come delimitatore per separare i dati

        while(in.hasNext()){    //in.hasNext() verifica se ci sono ancora dati da leggere
            String line = in.next(); //legge il prossimo elemento separato da una virgola

            if (line.contains("$")) //Se una riga contiene il simbolo $,
                // viene sollevata un'eccezione MalformedFile con un messaggio di errore.
                throw new MalformedFile("Errore nella formattazione del file");
            System.out.println(line);   //Stampa ogni elemento valido del file sulla console.
        }
    }
}

//Il codice fornito implementa una classe Leggi con un metodo statico leggi(String filename) che:
    //Legge un file separato da virgole (delimitatore ,).
    //Controlla se il contenuto delle righe contiene caratteri specifici ($) che indicano un errore di formattazione.
    //Lancia un'eccezione personalizzata MalformedFile se il file non è correttamente formattato.