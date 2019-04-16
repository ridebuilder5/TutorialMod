package com.ridebuilder5.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1.0f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
	
	

}
