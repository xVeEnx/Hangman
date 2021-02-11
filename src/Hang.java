public class Hang {
    private byte lives=10;
    public Hang(){}
    public byte minusLive(){
        lives--;
        return lives;
    }
        public byte getLives(){
        return lives;
    }
}
