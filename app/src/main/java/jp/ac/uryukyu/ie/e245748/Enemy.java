package jp.ac.uryukyu.ie.e245748;

public class Enemy extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", getName(), getHitPoint(), getAttack());
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを HP から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() <= 0) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
