package com.demo.common.plugin;

import com.jfinal.plugin.IPlugin;

public class MyPlugin implements IPlugin {

	@Override
	public boolean start() {
		System.out.println("MyPlugin start");
		return true;
	}

	@Override
	public boolean stop() {
		System.out.println("MyPlugin stop");
		return true;
	}

}
