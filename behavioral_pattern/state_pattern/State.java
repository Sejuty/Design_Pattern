package behavioral_pattern.state_pattern;

interface State {
     void alert(AlertState context);
}
class Vibration implements State{
    @Override
    public void alert(AlertState context) {
        System.out.println("-----------Vibration----------");
    }
}
class Silent implements State{
    @Override
    public void alert(AlertState context) {
        System.out.println("---------Silent---------");
    }
}
class Ring implements State{
    @Override
    public void alert(AlertState context) {
        System.out.println("---------Ring---------");
    }
}

class AlertState {
    State current;

    public AlertState() {
        this.current = new Vibration();
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void alert() {
        this.current.alert(this);
    }
}

class Main{
    public static void main(String[] args) {
        AlertState c1 = new AlertState();
        c1.alert();
        c1.setCurrent(new Ring());
        c1.alert();
        c1.setCurrent(new Silent());
        c1.alert();
    }
}