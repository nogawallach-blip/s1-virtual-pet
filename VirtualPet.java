/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void inLove(){
        face.setMessage("Im in love");
        face.setImage("love");

    }

    public void sad(){
        face.setImage("sad");
        face.setMessage("Gosh I want a girlfriend so bad");

    }

    public void cry(){
        face.setImage("cry_3");
        face.setMessage("Why does no one love me??");
    }

    public void cuteGirl(){
        face.setImage("girl");
        face.setMessage("Wait!! I think you are cute!");
    }

    public void shocked(){
        face.setImage("shocked");
        face.setMessage("Really? WOW!! I think you are cute too!");
    }

    public void question(){
        face.setImage("question");
        face.setMessage("Do you want to be my girlfriend???");
    }

    public void ecstatic(){
        face.setImage("ecstatic_1");
        face.setMessage("YIPPEEE!");
    }

    public void love(){
        face.setImage("love");
        face.setMessage("I love you!");
    }

    public void enraged(){
        face.setImage("enraged");
        face.setMessage("GRRRR");

    }

    

} // end Virtual Pet
