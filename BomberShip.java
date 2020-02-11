package ships;

import projectiles.Bomb;
import projectiles.Projectile;
import utils.Position;

public class BomberShip extends InvaderShip {
	public static final double EXPLOSION_RADIUS = 10;

  /**
   * Constructs a BomberShip
   * @param p The initial position
   * @param armor The initial armor level
   */
	public BomberShip(Position p, int armor) {
		super(p, armor);
	}

  /**
   * Drops a single bomb
   * 
   * @return An array containing a single bomb
   */
        public Projectile[] fire() {
           
        	if(!canFire()) {
        		return null;
        	}
        	
        	Projectile[] x = new Projectile[1];
    		Position p = new Position(pos.getX() + InvaderShip.SHIPS_Y / 2, pos.getY() - InvaderShip.SHIPS_X / 2);
        	x[0] = new Bomb(p, 0, -PROJECTILE_SPEED, -.01 , EXPLOSION_RADIUS);
        	
        	
        	return x;
	} 

	@Override
	public String imgPath() {
		return "res/monster2.png";
	}

	@Override
	public int getPoints() {
		return 100;
	}
}
