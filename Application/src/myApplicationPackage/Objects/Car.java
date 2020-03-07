package myApplicationPackage.Objects;

public  class Car  extends Machine {


    public void start(){
        super.start();
    }
    @Override
    public void stop(){
        super.stop();
    }

    public void openWindow(){
        System.out.println("Window opened.");
    }

}
