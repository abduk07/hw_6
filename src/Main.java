public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(400);
        boss.setBossDamage(50);
        boss.setBossWeapon(WeaponType.BULAWA);

        System.out.println(boss.info());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setBossHealth(100);
        skeleton1.setBossDamage(20);
        skeleton1.setBossWeapon(WeaponType.BOW);
        skeleton1.setArrows(10);

        System.out.println(skeleton1.info());


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setBossHealth(120);
        skeleton2.setBossDamage(15);
        skeleton2.setBossWeapon(WeaponType.BOW);
        skeleton2.setArrows(15);

        System.out.println(skeleton2.info());
    }
}