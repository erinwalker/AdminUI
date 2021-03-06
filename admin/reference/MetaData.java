package com.dyn.admin.reference;

import java.util.Arrays;

import net.minecraftforge.fml.common.ModMetadata;

public class MetaData {
	public static ModMetadata init(ModMetadata metadata) {
		metadata.modId = Reference.MOD_ID;
		metadata.name = Reference.MOD_NAME;
		metadata.description = "A control panel for admins on the DYN server";
		metadata.url = "https://github.com/Digital-Youth-Network/AdminUI";
		metadata.version = Reference.VERSION;
		metadata.authorList = Arrays.asList("Dom Amato");
		metadata.credits = "";
		metadata.autogenerated = false;
		return metadata;
	}
}
