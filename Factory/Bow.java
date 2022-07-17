package Factory;

public class Bow implements Item {

    @Override
    public void use() {
        System.out.println("화살로 쏘다!!");
    }    
}
