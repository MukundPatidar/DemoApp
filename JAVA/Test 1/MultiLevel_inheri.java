class Animal{
    void Name(){
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void Sound(){
        System.out.println("bho bho...!");
    }
}
class Panda extends Dog{
    void Sleep(){
        System.out.println("zzzzz....");
    }
}

public class MultiLevel_inheri {
    public static void main(String args[]){
        Panda obj = new Panda();

        obj.Name();
        obj.Sound();
        obj.Sleep();
    }
}
