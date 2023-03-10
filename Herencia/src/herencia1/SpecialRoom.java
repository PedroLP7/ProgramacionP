package herencia1;

public class SpecialRoom extends Cinema{




        private    int aditionalP;

    public SpecialRoom(int id, String name, int price) {
        super(id, name, price);
    }

    public SpecialRoom(int id , String name, int price, int aditionalP) {
            super(id,name,price);
            this.aditionalP = aditionalP;
        }

    @Override
    public String toString() {
        return
             super.toString()+
                " Addition:  " + aditionalP

                ;

    }


    public void glasses3d(){
        System.out.println("Put on your 3d glasses pls");
    }


    public int getAditionalP() {
        return this.aditionalP;
    }

    public void setAditionalP(int aditionalP) {
        this.aditionalP = aditionalP;
    }
}


