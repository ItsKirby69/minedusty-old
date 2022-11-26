package MineDusty;

import MineDusty.content.DustBlocks;
import MineDusty.content.DustLiquids;
import MineDusty.content.DustTechTree;
import MineDusty.content.DustLiquids;
import MineDusty.content.DustBullets;
import MineDusty.content.DustPlanets;
import MineDusty.content.DustItems;
import MineDusty.content.DustSectors;

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
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        DustBlocks.load();
        //DustTechTree.load();
        //DustLiquids.load();
        //DustItems.load();
        //DustBullets.load();
        //DustPlanets.load();
        //DustSectors.load();
    }

}
