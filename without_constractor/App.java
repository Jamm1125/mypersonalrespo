public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyagility();
        knight.sayMyintelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyagility();
        mage.sayMyintelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyagility();
        thief.sayMyintelligence();

        Character paladin = new Character();
        paladin.strength = 8;
        paladin.agility = 5;
        paladin.intelligence = 5;
        paladin.name = "Chiz";
        paladin.sayMyName();
        paladin.sayMyStrength();
        paladin.sayMyagility();
        paladin.sayMyintelligence();

    }
}
