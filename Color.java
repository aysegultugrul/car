public enum Color {
    BEYAZ("InciBeyazı",0),
    SARI("CivcivSarisi",1),
    YESIL("SuYesili",2),
    MAVI("GokyuzuMavisi",3),
    KIRMIZI("YakutKirmizi",4);
    private int renkKod;
    private String avatar;
    private Color(String avatar,int renkKod){
        this.renkKod=renkKod;
        this.avatar=avatar;
    }


    public int getRenkKod() {
        return renkKod;
    }

    public String getAvatar() {
        return avatar;
    }
}
