package epicsquid.superiorshields.item;

import javax.annotation.Nonnull;

import de.ellpeck.naturesaura.api.NaturesAuraAPI;
import epicsquid.superiorshields.capability.shield.IShieldCapability;
import epicsquid.superiorshields.capability.shield.SuperiorShieldsCapabilityManager;
import epicsquid.superiorshields.shield.IShieldType;
import epicsquid.superiorshields.shield.effect.EffectTrigger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import vazkii.botania.api.mana.ManaItemHandler;

public class ItemAuraShield extends ItemSuperiorShield<IShieldType> {

  private int auraToConsume = 10;

  public ItemAuraShield(@Nonnull String name, @Nonnull IShieldType shieldType) {
    super(name, shieldType);
  }

  @Override
  protected boolean useEnergyToRecharge(@Nonnull ItemStack stack, @Nonnull EntityPlayer player) {
    return NaturesAuraAPI.instance().extractAuraFromPlayer(player, auraToConsume, false);
  }
}
