package AutoCall;

import AutoCall.Annotations.AutoCall;

public class Telefon {

    @AutoCall
    public void call(){
        System.out.println("Du ringer!");
    }

    @AutoCall
    public void answer(){
        System.out.println("Du svarade!");
    }

    @AutoCall
    public void hangUp(){
        System.out.println("Du la på!");

    }
}
