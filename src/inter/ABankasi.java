package inter;

public class ABankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABankasi(String bankaAdi, String terminal_id, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminal_id;
        this.password = password;
    }


    @Override
    public boolean connect(String ipAddress){
        System.out.println("Kullanici ip : "+ ipAddress);
        System.out.println("Makina ip : "+ this.hostIpAddress);
        System.out.println(this.bankaAdi + " baglandi");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber,String date, String cvc){
        System.out.println("Bankadan cevap bekleniyor !");
        System.out.println("islem basarili oldu !");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
