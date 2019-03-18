public class WaterBottle {

    private int volume;

    public WaterBottle(){ this.volume = 100; }

    public void Drink(){ this.volume -= 10; }

    public void Empty(){ this.volume = 0; }

    public void Fill(){ this.volume = 100; }

    public int getVolume() {
        return volume;
    }
}
