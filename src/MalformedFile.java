public class MalformedFile extends Exception {

    /**
     * costruttore
     * @param messaggio
     */
    public MalformedFile(String messaggio){

        super(messaggio);
    }
}

//Exception è una eccezione che già esiste e controlla la lettura del file

//MalformedFile  è una classe di eccezione che va ad estendere questa eccezione e controlla
//che il file sia formattato correttamente e nel caso stampa il messaggio


