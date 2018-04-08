class Item{
    private String name;
    private String description;
    private int copies;
    private int dmg;
    
    String getName(){
        return this.name;
    }
    String getDescription(){
        return this.description;
    }
    int getCopies(){
        return this.copies;
    }
    int getDmg(){
        return this.dmg;
    }

    void setName(String newName){
        this.name = newName;
    }
    void setDescription(String newDescription){
        this.description = newDescription;
    }
    void setCopies(int newNumber){
        this.copies = newNumber;
    }
    void setDmg(int newDmg){
        this.dmg = newDmg;
    }
}

class Pants extends Item{
    public Pants(){
        setName("Pants");
        setDescription("A regular pair of pants, nothing special. At all. Really, just pants.");
        setCopies(1);
        setDmg(0);
    }
}
class Shoes extends Item{
    public Shoes(){
       setName("Shoes");
       setDescription("Shoes! They fit!");
       setCopies(1);
       setDmg(1);
    }
}
class SmallShoes extends Item{
    public SmallShoes(){
        setName("Small shoes");
        setDescription("Shoes! They doesn't really fit");
        setCopies(1);
        setDmg(1);
    }
}
class LargeShoes extends Item{
    public LargeShoes(){
        setName("Large shoes");
        setDescription("Shoes! They doesn't really fit");
        setCopies(1);
        setDmg(1);
    }
}
class NormieShoes extends Item{
    public NormieShoes(){
        setName("Normie Shoes");
        setDescription("Shoes! Ugly non-glittery shoes.");
        setCopies(1);
        setDmg(1);
    }
}