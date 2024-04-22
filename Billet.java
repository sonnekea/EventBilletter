public abstract class Billet {

    private int pris = 0;

    private int iD = 0;

    private int eventDate = 0;

    private int whenTicketBought = 0;

    static int incrementingID = 0;

    public Billet(int iD) {
        this.iD = iD;
        this.pris = pris;
        this.eventDate = eventDate;
        this.whenTicketBought = whenTicketBought;
    }

    public abstract void isSoldEarly();
}
