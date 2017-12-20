package sihenzhang.gtaspects;

import ic2.core.Ic2Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class Aspects {
    public static Aspect STRONTIO;
    public static Aspect NEBRISUM;
    public static Aspect ELECTRUM;
    public static Aspect MAGNETO;
    public static Aspect RADIO;

    public static void initAspects() {
        STRONTIO = new Aspect("strontio", 0xeec2b3, new Aspect[] { Aspect.MIND, Aspect.ENTROPY }, new ResourceLocation("gtaspects", "textures/aspects/STRONTIO.png"), 1);
        NEBRISUM = new Aspect("nebrisum", 0xeeee7e, new Aspect[] { Aspect.MINE, Aspect.GREED }, new ResourceLocation("gtaspects", "textures/aspects/NEBRISUM.png"), 1);
        ELECTRUM= new Aspect("electrum", 0xc0eeee, new Aspect[] { Aspect.ENERGY, Aspect.MECHANISM }, new ResourceLocation("gtaspects", "textures/aspects/ELECTRUM.png"), 1);
        MAGNETO = new Aspect("magneto", 0xc0c0c0, new Aspect[] { Aspect.METAL, Aspect.TRAVEL }, new ResourceLocation("gtaspects", "textures/aspects/MAGNETO.png"), 1);
        RADIO = new Aspect("radio", 0xc0ffc0, new Aspect[] { Aspect.LIGHT, Aspect.ENERGY }, new ResourceLocation("gtaspects", "textures/aspects/RADIO.png"), 1);
    }

    private static AspectList getAspectList(ItemStack stack) {
        AspectList list = ThaumcraftApiHelper.getObjectAspects(stack);
        return list != null ? list : new AspectList();
    }

    public static void addAspects() {
        AspectList list;

        list = getAspectList(Ic2Items.electroFurnace.copy());
        list.add(Aspect.METAL, 10);
        list.add(Aspect.FIRE, 8);
        list.add(ELECTRUM, 6);
        list.add(Aspect.ENERGY, 4);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.CRAFT, 4);
        ThaumcraftApi.registerObjectTag(Ic2Items.electroFurnace.copy(), list);

        list = getAspectList(Ic2Items.macerator.copy());
        list.add(Aspect.METAL, 10);
        list.add(Aspect.MINE, 4);
        list.add(ELECTRUM, 6);
        list.add(Aspect.CRAFT, 6);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.CRYSTAL, 4);
        list.remove(Aspect.ENERGY);
        ThaumcraftApi.registerObjectTag(Ic2Items.macerator.copy(), list);

        list = getAspectList(Ic2Items.extractor.copy());
        list.add(Aspect.METAL, 10);
        list.add(Aspect.CRAFT, 6);
        list.add(ELECTRUM, 6);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.AIR, 4);
        list.add(Aspect.TOOL, 4);
        list.remove(Aspect.ENERGY);
        ThaumcraftApi.registerObjectTag(Ic2Items.extractor.copy(), list);

        list = getAspectList(Ic2Items.compressor.copy());
        list.add(Aspect.METAL, 10);
        list.add(Aspect.VOID, 7);
        list.add(ELECTRUM, 6);
        list.add(Aspect.CRAFT, 6);
        list.add(Aspect.MOTION, 6);
        list.add(Aspect.MECHANISM, 4);
        list.remove(Aspect.ENERGY);
        ThaumcraftApi.registerObjectTag(Ic2Items.compressor.copy(), list);

        ThaumcraftApi.registerObjectTag(Ic2Items.canner.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 8).add(Aspect.WATER, 6).add(Aspect.VOID, 6).add(ELECTRUM, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.pump.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 6).add(Aspect.WATER, 8).add(Aspect.TRAVEL, 6).add(ELECTRUM, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.magnetizer.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 6).add(MAGNETO, 8).add(Aspect.MOTION, 6).add(ELECTRUM, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.recycler.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 6).add(Aspect.LIGHT, 8).add(Aspect.EARTH, 6).add(ELECTRUM, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.advancedMachine.copy(), (new AspectList()).add(Aspect.METAL, 22).add(Aspect.MECHANISM, 10).add(NEBRISUM, 5).add(STRONTIO, 5));

        ThaumcraftApi.registerObjectTag(Ic2Items.inductionFurnace.copy(), (new AspectList()).add(Aspect.METAL, 32).add(Aspect.FIRE, 12).add(Aspect.ENERGY, 8).add(ELECTRUM, 10).add(STRONTIO, 10).add(NEBRISUM, 5));

        ThaumcraftApi.registerObjectTag(Ic2Items.massFabricator.copy(), (new AspectList()).add(Aspect.METAL, 50).add(Aspect.WATER, 35).add(Aspect.EXCHANGE, 30).add(ELECTRUM, 25).add(NEBRISUM, 15).add(STRONTIO, 10));

        ThaumcraftApi.registerObjectTag(Ic2Items.terraformer.copy(), (new AspectList()).add(Aspect.METAL, 30).add(Aspect.EARTH, 25).add(Aspect.EXCHANGE, 20).add(ELECTRUM, 15).add(STRONTIO, 12).add(NEBRISUM, 10));

        list = getAspectList(Ic2Items.teleporter.copy());
        list.add(Aspect.METAL, 37);
        list.add(Aspect.ELDRITCH, 38);
        list.add(Aspect.TRAVEL, 32);
        list.add(ELECTRUM, 25);
        list.add(STRONTIO, 18);
        list.add(NEBRISUM, 18);
        list.remove(Aspect.ENERGY);
        list.remove(Aspect.CRYSTAL);
        list.remove(Aspect.MECHANISM);
        ThaumcraftApi.registerObjectTag(Ic2Items.teleporter.copy(), list);

        ThaumcraftApi.registerObjectTag(Ic2Items.teslaCoil.copy(), (new AspectList()).add(Aspect.METAL, 15).add(Aspect.ENERGY, 12).add(ELECTRUM, 10).add(Aspect.MECHANISM, 8).add(MAGNETO, 6).add(STRONTIO, 2));

        list = getAspectList(Ic2Items.centrifuge.copy());
        list.add(Aspect.METAL, 36);
        list.add(Aspect.ENERGY, 23);
        list.add(Aspect.FIRE, 28);
        list.add(ELECTRUM, 22);
        list.add(STRONTIO, 16);
        list.add(NEBRISUM, 12);
        list.remove(Aspect.GREED);
        list.remove(Aspect.CRYSTAL);
        list.remove(Aspect.MECHANISM);
        ThaumcraftApi.registerObjectTag(Ic2Items.centrifuge.copy(), list);

        ThaumcraftApi.registerObjectTag(Ic2Items.metalformer.copy(), (new AspectList()).add(Aspect.METAL, 12).add(ELECTRUM, 10).add(Aspect.TOOL, 10).add(Aspect.CRAFT, 10).add(Aspect.MECHANISM, 8).add(Aspect.ORDER, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.orewashingplant.copy(), (new AspectList()).add(Aspect.METAL, 15).add(Aspect.MINE, 12).add(Aspect.WATER, 12).add(ELECTRUM, 10).add(Aspect.CRAFT, 9).add(Aspect.MECHANISM, 8));

        list = getAspectList(Ic2Items.patternstorage.copy());
        list.add(Aspect.METAL, 33);
        list.add(Aspect.ENERGY, 30);
        list.add(Aspect.MIND, 28);
        list.add(Aspect.CRYSTAL, 24);
        list.add(ELECTRUM, 20);
        list.add(NEBRISUM, 12);
        ThaumcraftApi.registerObjectTag(Ic2Items.patternstorage.copy(), list);

        ThaumcraftApi.registerObjectTag(Ic2Items.scanner.copy(), (new AspectList()).add(Aspect.METAL, 38).add(Aspect.SENSES, 33).add(Aspect.EXCHANGE, 26).add(ELECTRUM, 22).add(STRONTIO, 18).add(NEBRISUM, 12));

        ThaumcraftApi.registerObjectTag(Ic2Items.replicator.copy(), (new AspectList()).add(Aspect.METAL, 52).add(Aspect.ELDRITCH, 44).add(Aspect.EXCHANGE, 38).add(Aspect.ENERGY, 26).add(ELECTRUM, 22).add(NEBRISUM, 18));

        ThaumcraftApi.registerObjectTag(Ic2Items.condenser.copy(), (new AspectList()).add(Aspect.METAL, 18).add(Aspect.WATER, 14).add(Aspect.COLD, 14).add(Aspect.MECHANISM, 12).add(ELECTRUM, 10).add(Aspect.TOOL, 8));

        ThaumcraftApi.registerObjectTag(Ic2Items.steamgenerator.copy(), (new AspectList()).add(Aspect.METAL, 18).add(Aspect.WATER, 14).add(Aspect.FIRE, 14).add(Aspect.MECHANISM, 12).add(ELECTRUM, 10).add(Aspect.TOOL, 8));

        ThaumcraftApi.registerObjectTag(Ic2Items.blastfurnace.copy(), (new AspectList()).add(Aspect.METAL, 20).add(Aspect.FIRE, 14).add(Aspect.ENERGY, 14).add(Aspect.MECHANISM, 12).add(Aspect.CRAFT, 12));

        ThaumcraftApi.registerObjectTag(Ic2Items.lathe.copy(), (new AspectList()).add(Aspect.METAL, 20).add(Aspect.CRAFT, 16).add(Aspect.TOOL, 14).add(Aspect.MECHANISM, 12));
    }
}