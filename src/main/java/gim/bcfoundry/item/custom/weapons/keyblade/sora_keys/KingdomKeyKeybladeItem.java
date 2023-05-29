package gim.bcfoundry.item.custom.weapons.keyblade.sora_keys;

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

public class KingdomKeyKeybladeItem extends SwordItem {
    public KingdomKeyKeybladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if ((Screen.hasShiftDown())) {
            tooltip.add(Text.literal("CREDITS").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "DEV: GimGirin").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "MODEL: GimGirin").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "SOUNDS: Daedelus").formatted(Formatting.RED));
            tooltip.add(Text.literal( "ANIMATIONS: GimGirin").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("IP: Kingdom Hearts").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Sora's Original Keyblade").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Press Shift for more info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
