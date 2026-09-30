import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        vp.sad();
        this.waitABeat(2000);
        vp.cry();
        this.waitABeat(2000);
        vp.cuteGirl();
        this.waitABeat(2000);
        vp.shocked();
        this.waitABeat(2000);
        vp.question();
        this.waitABeat(2000);
        String ans = this.askForInput("Do you accept?");
        if(ans.equals("yes")){
            vp.ecstatic();
            this.waitABeat(2000);
            vp.love(); 
        } else
            vp.cry();
            this.waitABeat(2000);
            String ans2 = this.askForInput("Are you sure?");
            if(ans2.equals("yes")){
                vp.enraged();
            } else{
                vp.ecstatic();
                this.waitABeat(2000);
                vp.love();
            }



            




        // vp.exercise();
        // this.waitABeat(1000);
        // String ans = this.askForInput("Are you ready to sleep?");
        // if(ans.equals("yes"))
        //     vp.sleep();
        // else 
        //     vp.exercise();
        

    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPMain();    
    }
}

