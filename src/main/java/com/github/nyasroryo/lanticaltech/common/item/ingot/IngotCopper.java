package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class IngotCopper extends ItemBase {

  public static final String MyName = "ingotCopper";

  public IngotCopper() {
    super(MyName);
  }

  public static final Item ME = new IngotCopper();
}