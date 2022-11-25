package MineDusty.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;

import mindustry.*;
import mindustry.content.*;
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

import static MineDusty.Minedusty.*;
import static mindustry.type.ItemStack.*;

public class DustBlocks {
	public static Block 
	//Turrets
	Silo, 
	//Walls
	largeBoulder;
	//Drills
	//add more categories

	public static void load(){

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
	}
}
