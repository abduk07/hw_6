public class Entity {

    private int  damage;
    private int health;
    private WeaponType weapon;

    private int heroDamage;
    private int heroHealth;
    private WeaponType heroWeapon;

    public int getBossDamage() {
        return damage;
    }

    public void setBossDamage(int bossDamage) {
        this.damage = bossDamage;
    }

    public int getBossHealth() {
        return health;
    }

    public void setBossHealth(int bossHealth) {
        this.health = bossHealth;
    }

    public WeaponType getBossWeapon() {
        return weapon;
    }

    public void setBossWeapon(WeaponType bossWeapon) {
        this.weapon = bossWeapon;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public WeaponType getHeroWeapon() {
        return heroWeapon;
    }

    public void setHeroWeapon(WeaponType heroWeapon) {
        this.heroWeapon = heroWeapon;
    }
    public String info(){
        return "Boss health: " + this.health + " " + "Boss damage: " + this.damage + " " + "Boss weapon: " + this.weapon;
    }
}