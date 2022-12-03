package minedusty;

import minedusty.content.DustBlocks;
import minedusty.content.DustLiquids;
import minedusty.content.DustTechTree;
import minedusty.content.DustLiquids;
import minedusty.content.DustBullets;
import minedusty.content.DustPlanets;
import minedusty.content.DustItems;
import minedusty.content.DustSectors;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Minedusty extends Mod{

    public Minedusty(){
        Log.info("*cough* *cough* Minedusty is *cough* loaded");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("A spooky Warning").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("minedusty-frog.png")).pad(20f).row();
				dialog.cont.add("[gray]Please note that his mod is still in Beta.[]").row();
				dialog.cont.add("[scarlet]Contact me through discord[] [brick]ItsDaKIRBY69#5369[] [scarlet]for any bugs that occur[]").row();
				dialog.cont.add("[gray]Mess around with the mod and have fun :)[]").row();
                dialog.cont.button("Got it fam", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        DustBlocks.load();
        //DustTechTree.load();
        //DustLiquids.load();
        DustItems.load();
        //DustBullets.load();
        //DustPlanets.load();
        //DustSectors.load();
    }

}
