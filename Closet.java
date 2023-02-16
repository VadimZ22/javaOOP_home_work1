package Home_Work1;

public class Closet {
    int length;
    int width;
    int height;
    private State state;

    public State getState() {
        return state;
    }

    public Closet() {
        this.state = State.Close;
    }
    enum State {
        Open, Close
    }

    public void toInteractCloset(Human h){
        if (this.state == State.Close){
            this.state = State.Open;
        }
        else this.state = State.Close;
    }
}
