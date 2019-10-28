package org.mystic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.mystic.model.Items;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public List itemList(){
        List<Items> fewItems=new ArrayList<>();
        fewItems.add(new Items(1,"Led bulb",180.0,"Polycab"));
        fewItems.add(new Items(2,"Photo frame",220.0,"imax"));
        fewItems.add(new Items(3,"Encyclopedia",499.0,"Knowledge dk"));
        fewItems.add(new Items(4,"jug",120.0,"3 star kala"));
        fewItems.add(new Items(5,"Flower gift",200.0,"Pink"));
        fewItems.add(new Items(6,"A4 Sheet",499.0,"TNPL"));
        fewItems.sort(Comparator.comparingDouble(Items::getPrice).reversed());
        return fewItems;
    }
    public static void main(String args[]){
        Main mystic=new Main();
        List<Items> nlist=mystic.itemList();
        nlist.forEach(items-> System.out.println(items));
    }
}
