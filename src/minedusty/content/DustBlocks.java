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

		largeBoulder = new Wall("large-boulder"){{
			localizedName = "large boulder";
			size = 2;
			hasShadow = true;
			instantDeconstruct = true;
			breakSound = Sounds.rockBreak;
			breakEffect = Fx.breakProp;
			mapColor = Color.valueOf("706f74");
			customShadow = true;
			variants = 2;
		}};
		// this is a silo
		scatterSilo = new ItemTurret("scatter-silo"){{
			requirements(Category.turret, with(Items.copper, 85, Items.lead, 75, Items.titanium, 25));
			localizedName = "Scatter Silo";
			description = "Turret air defence test";

			size = 2;
			health = 850;
		
			range = 275f;
			rotateSpeed = 8f;
			targetAir = true;
			targetGround = false;
			inaccuracy = 11f;
			buildCost = 500f;
		
			shoot.shots = 5;
			shoot.shotDelay = 60f;
			
			ammo(
				Items.scrap, new FlakBulletType(4f, 5f){{
					splashDamage = 10f;
					splashDamageRadius = 8f;
					knockback = 0.8f;
					speed = 6f;
					lifetime = 90f;
					width = 8f;
					height = 8f;
					hitEffect = Fx.flakExplosion;
				}}
			);

		}};
		
	}
}
