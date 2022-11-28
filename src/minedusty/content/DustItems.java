package minedusty.content;

import arc.*;
import arc.graphics.*;
import minedusty.graphics.*;
import mindustry.type.Item;
//import mindustry.Item;
//import minedusty.ui.*;
import mindustry.*;
import mindustry.content.Items;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;


public class DustItems {
	public static Item quartz, rosequartz;

	public static void load(){
		quartz = new Item("FunnyWhiteCrystal", pal2.quartz){{
			localizedName = "Quartz";
			flammability = 0.25f;
			hardness = 2;
		}};

		rosequartz = new Item("FunnyPinkCrystal", pal2.rosequartz){{
			localizedName = "Rose Quartz";
			flammability = 0.25f;
			hardness = 2;
		}};
		
	}
}
