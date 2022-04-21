public abstract class Duck {

        //interface type
    //instance variables hold a reference to a specific behavior at runtime
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck (){

    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
