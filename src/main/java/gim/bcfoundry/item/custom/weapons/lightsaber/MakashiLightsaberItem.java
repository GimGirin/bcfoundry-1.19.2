package gim.bcfoundry.item.custom.weapons.lightsaber;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MakashiLightsaberItem extends SwordItem {
    public MakashiLightsaberItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if ((Screen.hasShiftDown())) {
            tooltip.add(Text.literal("CREDITS").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "DEV: GimGirin").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "MODEL: GimGirin").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "SOUNDS: GimGirin").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "ANIMATIONS: GimGirin").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("IP: Star Wars").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Lightsaber form 2 techniques").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Press Shift for more info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
