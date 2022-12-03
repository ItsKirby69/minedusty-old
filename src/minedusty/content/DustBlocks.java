package minedusty.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;

import mindustry.*;
import mindustry.content.*;
import mindustry.entities.bullet.FlakBulletType;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static minedusty.Minedusty.*;
import static mindustry.type.ItemStack.*;

public class DustBlocks {
	public static Block 
	//Turrets
	scatterSilo, 
	//Walls
	//Drills
	//Props
	largeBoulder;
	//add more categories

	public static void load(){
		//props/walls
		largeBoulder = new Wall("large-boulder"){{
			size = 2;
			hasShadow = true;
			instantDeconstruct = true;
			breakSound = Sounds.rockBreak;
			breakEffect = Fx.breakProp;
			mapColor = Color.valueOf("706f74");
			customShadow = true;
			variants = 2;
		}};

		//idea to add quartz walls that deflect lazers or smthn
		//function numbers (speed, damage)
		//turrets
		scatterSilo = new ItemTurret("scatter-silo"){{
			requirements(Category.turret, with(Items.copper, 85, Items.lead, 75, Items.titanium, 25));
			size = 2;
			health = 850;
		
			range = 275f;
			rotateSpeed = 8f;
			targetAir = true;
			targetGround = false;
			inaccuracy = 11f;
			shootCone = 20f;
			buildCost = 500f;

			reload = 24f;

            shoot.shotDelay = 5f;
            shoot.shots = 2;
            shootSound = Sounds.shootSnap;
			ammo(
				Items.lead, new FlakBulletType(6f, 6f){{
					ammoMultiplier = 6f;
					splashDamage = 55f;
					splashDamageRadius = 24f;
					knockback = 0.8f;
					lifetime = 90f;
					width = 6f;
					height = 8f;
					shootEffect = Fx.shootSmall;
					hitEffect = Fx.flakExplosion;
				}},
				Items.metaglass, new FlakBulletType(5.5f, 6f){{
					ammoMultiplier = 6f;
					splashDamage = 60f;
					splashDamageRadius = 28f;
					knockback = 0.8f;
					lifetime = 90f;
					width = 6f;
					height = 8f;
					reloadMultiplier = 0.8f;
					shootEffect = Fx.shootSmall;
					hitEffect = Fx.flakExplosion;
				}},
				Items.scrap, new FlakBulletType(5.5f, 5f){{
					ammoMultiplier = 7f;
					splashDamage = 45f;
					splashDamageRadius = 24f;
					knockback = 0.8f;
					lifetime = 90f;
					width = 6f;
					height = 8f;
					reloadMultiplier = 0.5f;
					shootEffect = Fx.shootSmall;
					hitEffect = Fx.flakExplosion;
				}}
			);

		}};
	
		//deco blocks
		livingTree = new TreeBlock("live-tree");

		
	}
}
