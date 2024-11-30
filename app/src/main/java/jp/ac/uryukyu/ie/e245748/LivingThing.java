package jp.ac.uryukyu.ie.e245748;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = Math.max(hitPoint, 0);
    }

    public int getAttack() {
        return attack;
    }

    public void attack(LivingThing opponent) {
        if (!dead && attack > 0) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (hitPoint <= 0) {
            setDead(true);
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
