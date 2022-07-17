package Factory;

public class Shield implements Item {

    @Override
    public void use() {
        System.out.println("방패로 공격 막기!!");
    }    
}
