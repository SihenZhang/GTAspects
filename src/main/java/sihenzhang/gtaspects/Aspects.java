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
        list.add(ELECTRUM, 6);
        list.add(Aspect.CRAFT, 4);
        list.add(Aspect.METAL, 10);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.FIRE, 8);
        list.add(Aspect.ENERGY, 4);
        ThaumcraftApi.registerObjectTag(Ic2Items.electroFurnace.copy(), list);

        list = getAspectList(Ic2Items.macerator.copy());
        list.add(ELECTRUM, 6);
        list.add(Aspect.CRAFT, 6);
        list.add(Aspect.METAL, 10);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.MINE, 4);
        list.add(Aspect.CRYSTAL, 4);
        list.remove(Aspect.ENERGY);
        ThaumcraftApi.registerObjectTag(Ic2Items.macerator.copy(), list);

        list = getAspectList(Ic2Items.extractor.copy());
        list.add(ELECTRUM, 6);
        list.add(Aspect.CRAFT, 6);
        list.add(Aspect.METAL, 10);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.AIR, 4);
        list.add(Aspect.TOOL, 4);
        list.remove(Aspect.ENERGY);
        ThaumcraftApi.registerObjectTag(Ic2Items.extractor.copy(), list);

        list = getAspectList(Ic2Items.compressor.copy());
        list.add(ELECTRUM, 6);
        list.add(Aspect.CRAFT, 6);
        list.add(Aspect.METAL, 10);
        list.add(Aspect.MECHANISM, 4);
        list.add(Aspect.MOTION, 6);
        list.add(Aspect.VOID, 7);
        list.remove(Aspect.ENERGY);
        ThaumcraftApi.registerObjectTag(Ic2Items.compressor.copy(), list);

        ThaumcraftApi.registerObjectTag(Ic2Items.canner.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 8).add(Aspect.WATER, 6).add(Aspect.VOID, 6).add(ELECTRUM, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.pump.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 6).add(Aspect.WATER, 8).add(Aspect.TRAVEL, 6).add(ELECTRUM, 6));

        ThaumcraftApi.registerObjectTag(Ic2Items.magnetizer.copy(), (new AspectList()).add(Aspect.CRAFT, 6).add(Aspect.METAL, 12).add(Aspect.MECHANISM, 6).add(MAGNETO, 8).add(Aspect.MOTION, 6).add(ELECTRUM, 6));

    }
}