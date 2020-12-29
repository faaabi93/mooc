public class Counter {
    private int number;

    public Counter(int startValue){
        this.number = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return this.number;
    }

    public void increase(){
        increase(1);
    }

    public void increase(int increaseBy){
        if(increaseBy >= 0){
            this.number = this.number + increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            this.number = this.number - decreaseBy;
        }
    }

    public void decrease(){
        decrease(1);
    }

    public String toString(){
        return "" + this.number;
    }
}
