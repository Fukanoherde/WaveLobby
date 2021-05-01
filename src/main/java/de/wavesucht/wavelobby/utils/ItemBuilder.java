package de.wavesucht.wavelobby.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class ItemBuilder {

    // [Variable]
    private final ItemStack itemStack;
    private final ItemMeta itemMeta;
    private SkullMeta skullMeta;

    //[Constructor]
    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }
    public ItemBuilder (ItemStack itemStack) {
        this.itemStack = itemStack;
        this.itemMeta = this.itemStack.getItemMeta();
    }

    //[Basics]
    public ItemBuilder setMaterial (Material material) {
        itemStack.setType(material);
        return this;
    }
    public ItemBuilder setSubid(byte subid) {
        itemStack.getData().setData(subid);
        return this;
    }
    public ItemBuilder setAmount(int amount) {
        itemStack.setAmount(amount);
        return this;
    }
    public ItemBuilder setName(String name) {
        this.itemMeta.setDisplayName(name);
        return this;
    }
    public ItemBuilder setDurability(short durability) {
        this.itemStack.setDurability(durability);
        return this;
    }

    // [Enchantments]
    public ItemBuilder setEnchantments(Map<Enchantment, Integer> enchantments) {
        enchantments.forEach(((enchantment, level) -> this.itemStack.addEnchantment(enchantment, level)));
        return this;
    }
    public ItemBuilder addEnchantment(Enchantment enchantment, Integer level) {
        this.itemStack.addEnchantment(enchantment, level);
        return this;
    }
    public ItemBuilder clearEnchantments() {
        this.itemStack.getEnchantments().keySet().forEach(enchantment -> this.itemStack.removeEnchantment(enchantment));
        return this;
    }
    public ItemBuilder removeEnchantment(Enchantment enchantment) {
        this.itemStack.removeEnchantment(enchantment);
        return this;
    }

    // [Lore]
    public ItemBuilder setLore(List<String> lore) {
        itemMeta.setLore(lore);
        return this;
    }
    public ItemBuilder addLore(String lore) {
        List<String> loreList = itemMeta.getLore();
        loreList.add(lore);
        itemMeta.setLore(loreList);
        return this;
    }
    public ItemBuilder clearLore() {
        itemMeta.setLore(new ArrayList<>());
        return this;
    }
    public ItemBuilder removeLore(String lore) {
        itemMeta.getLore().remove(lore);
        return this;
    }

    // [Skull]
    public ItemBuilder setSkullOwner (String owner) {
        itemStack.setItemMeta(itemMeta);
        skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(owner);
        return this;
    }

    // [Build]
    public ItemStack build() {
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
    public ItemStack buildSkull() {
        itemStack.setItemMeta(skullMeta);
        itemStack.getData().setData((byte) 3);
        return itemStack;
    }
}