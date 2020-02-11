package ships;

import projectiles.Projectile;
import utils.Position;

public class MultiShooterShip extends ShooterShip {
	public static final int NUM_CANNONS = 5;
	public static final double SPREAD = 0.25;

  /**
   * Constructs a MultiShooterShip
   * @param p The initial position
   * @param armor The initial armor level
   */
	public MultiShooterShip(Position p, int armor) {
		super(p,armor);
	}

  /**
   * Fires NUM_CANNONS projectiles, that spread out as they fall
   * @return An array of projectiles
   */
	public Projectile[] fire() {
          /*
           * Hint, to get a spread, second parameter to Projectile() should
           * be something like (i - (NUM_CANNONS / 2)) * SPREAD
           */
                
		Projectile[] x = new Projectile[NUM_CANNONS];
		Position p = new Position(pos.getX() + InvaderShip.SHIPS_Y / 2, pos.getY() - InvaderShip.SHIPS_X / 2);
		x[0] = new Projectile(p, (0 - (NUM_CANNONS / 2)) * SPREAD, -PROJECTILE_SPEED, -.01 );
		
		
		return null;
	}

	@Override
	public String imgPath() {
		return "res/monster3.png";
	}
}
