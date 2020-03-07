package myApplicationPackage.Objects;

public class Camera extends Machine{

    @Override
    public void start() {
        System.out.println("Camera Started");
    }

    public void snap(){
        System.out.println("Photo Taken!");
    }
}
