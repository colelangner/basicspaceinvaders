package ships;

import projectiles.Projectile;
import utils.Position;
/**
 * 
 * @author colelangner - Cole Langner
 *
 */
public class ShooterShip extends InvaderShip {
  /**
   * Constructs a ShooterShip
   * @param p The initial position
   * @param armor The initial armor level
   */
	public ShooterShip(Position p, int armor) {
		super(p,armor);
	}

	
	/**
	 * Fires shots if can fire returns true
	 */
	public Projectile[] fire() {
		if(!canFire()) {
			return null;
		}
		
		
		Projectile[] x = new Projectile[1];
		Position p = new Position(pos.getX() + InvaderShip.SHIPS_Y / 2, pos.getY() - InvaderShip.SHIPS_X / 2);
		x[0] = new Projectile(p, 0 , -PROJECTILE_SPEED, -.01);
		
		return x;
	}

	@Override
	public String imgPath() {
		return "res/monster.png";
		
	}

	@Override
	public int getPoints() {
		return 50;
	}
}
