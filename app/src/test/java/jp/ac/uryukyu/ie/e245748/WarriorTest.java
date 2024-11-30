package jp.ac.uryukyu.ie.e245748;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void testAttackWithWeaponSkill() {
        Warrior warrior = new Warrior("テスト戦士", 100, 20);
        Enemy enemy = new Enemy("テストスライム", 100, 10);

        for (int i = 0; i < 3; i++) {
            int initialHp = enemy.getHitPoint();
            warrior.attackWithWeaponSkill(enemy);
            int expectedDamage = (int)(warrior.getAttack() * 1.5);
            int actualDamage = initialHp - enemy.getHitPoint();
            
            assertEquals(expectedDamage, actualDamage, 
                "attackWithWeaponSkillのダメージが正しくありません");
        }
    }
}
