package homework7.clothes;

import homework7.clothes.boots.IBoots;
import homework7.clothes.jackets.IJacket;
import homework7.clothes.trousers.ITrousers;

public class Person implements IPerson{
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IBoots boots;

    public Person(String name, IJacket jacket, ITrousers trousers, IBoots boots) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.boots = boots;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public IBoots getBoots() {
        return boots;
    }

    public void setBoots(IBoots boots) {
        this.boots = boots;
    }

    @Override
    public void putOnEverything() {
        jacket.putOn();
        trousers.putOn();
        boots.putOn();
    }

    @Override
    public void takeOffEverything() {
        jacket.takeOff();
        trousers.takeOff();
        boots.takeOff();
    }
}
