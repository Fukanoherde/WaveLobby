package de.wavesucht.wavelobby.api;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemAPI {

    public static ItemStack creationItem(Material mat, int amount, int shortid, String DisplayName, Enchantment ench, int level) {
        short s = (short) shortid;
        ItemStack item = new ItemStack(mat, amount, s);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(ench, level, true);
        meta.setDisplayName(DisplayName);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack createPlayerHead(String Owner, String name, int amount, int shortId, String DisplayName) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, amount);
        SkullMeta skullmeta = (SkullMeta) skull.getItemMeta();
        skullmeta.setOwner(Owner);
        skullmeta.setDisplayName(DisplayName);
        skullmeta.setDisplayName(name);
        return skull;
    }
    public static ItemStack createItemNoEnch2(Material mat, int amount, int shortid, String DisplayName) {
        short s = (short) shortid;
        ItemStack item = new ItemStack(mat, amount, s, (byte) s);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(DisplayName);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createBootsWithName(Color color, String name){
        ItemStack itemStack = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();
        leatherArmorMeta.setDisplayName(name);
        leatherArmorMeta.setColor(color);
        itemStack.setItemMeta(leatherArmorMeta);

        return itemStack;
    }

    public static ItemStack createBanner(DyeColor dyeColor){
        ItemStack itemStack = new ItemStack(Material.BANNER, 1);
        BannerMeta bannerMeta = (BannerMeta) itemStack.getItemMeta();
        bannerMeta.setBaseColor(dyeColor);
        itemStack.setItemMeta(bannerMeta);

        return itemStack;
    }
}