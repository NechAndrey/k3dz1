package k3dz1;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> boxiest;

    public Box() {
        boxiest = new ArrayList<>();
    }

    public void addFruit(T fruit){
        boxiest.add(fruit);
    }

    public float sumWeight(){
        float result = 0.0f;
        for (Fruit f:this.boxiest) {
            result += f.getWeight();
        }
        return result;
    }

    public boolean compare(Box box) {
        return this.sumWeight() == box.sumWeight();
    }

    public ArrayList exchangeBox(Box<T> box) {
        ArrayList newBox = new ArrayList<>();
        for (Fruit f : box.boxiest) {
            newBox.add(f);
        }
        return newBox;
    }
}


