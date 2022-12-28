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
	//Productions
	mpulverizer,
	//Props
	largeBoulder, aliveTree,
	//ores
	oreQuartz;
	//add more categories

	public static void load(){
		//props/walls
		largeBoulder = new Prop("large-boulder"){{
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
			requirements(Category.turret, with(Items.copper, 85, Items.lead, 75, DustItems.dustquartz, 20));
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

		mpulverizer = new GenericCrafter("grinder"){{
            requirements(Category.crafting, with(Items.copper, 30, Items.lead, 25));
            outputItem = new ItemStack(DustItems.dustquartz, 1);
            craftEffect = Fx.pulverize;
            craftTime = 40f;
            updateEffect = Fx.pulverizeSmall;
            hasItems = hasPower = true;
            drawer = new DrawMulti(new DrawDefault(), new DrawRegion("-rotator"){{
                spinSprite = true;
                rotateSpeed = 2f;
            }}, new DrawRegion("-top"));
            ambientSound = Sounds.grinding;
            ambientSoundVolume = 0.025f;

            consumeItem(DustItems.quartz, 1);
            consumePower(0.50f);
        }};
	
		//deco blocks
		aliveTree = new TreeBlock("alive-tree");

		//ores
		oreQuartz = new OreBlock("ore-quartz", DustItems.quartz){{
			oreDefault = false;
            oreThreshold = 0.847f;
            oreScale = 25.580953f;
		}};

		
	}
}
