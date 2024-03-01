public class Monster {
    String monsterName;
    int monsterHealth;
    int monsterArmorClass;
    int monsterWeaponDamage;
    public Monster()
    { // same stats as hero right now so its an evenly matched fight -- probably will change later 
        monsterName = "Glorp the destroyer";
        monsterHealth = 10;
        monsterArmorClass = 10; 
        monsterWeaponDamage = (int)((Math.random()*(6-4+1))+ 4);
    }
    public Monster(String monsterName, int monsterHealth, int monsterArmorClass, int monsterWeaponDamage){
        this.monsterName = monsterName;
        this.monsterHealth = monsterHealth;
        this.monsterArmorClass= monsterArmorClass;
        this.monsterWeaponDamage=monsterWeaponDamage;
       }
}
