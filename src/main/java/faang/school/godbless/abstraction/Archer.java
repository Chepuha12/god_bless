package faang.school.godbless.abstraction;

public class Archer extends Character {
    public Archer (String name){
        super(name, 3, 10, 5);
    }

    @Override
    public String attack(Character character) {
        int damage = this.agility;
        if (character.health > damage){
            character.health -= damage;
            return String.format(Message.DAMAGE_DONE, damage, character.health);
        }
        character.health -= damage;

        return String.format(Message.ENEMY_DEAD, damage);
    }
}
