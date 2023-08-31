package Rewards.Copper;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class CopperGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new CopperRewards();
    }
}
