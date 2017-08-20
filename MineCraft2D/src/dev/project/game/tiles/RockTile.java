package dev.project.game.tiles;

import dev.project.game.gfx.Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Assets.concrete, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
}
