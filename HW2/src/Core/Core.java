package Core;

import Abstractions.ItemGenerator;
import Rewards.Copper.CopperGenerator;
import Rewards.Gem.GemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = fillList(new GemGenerator(), 1, new GoldGenerator(), 9,
                new SilverGenerator(), 20, new CopperGenerator(), 70);

        Random random = new Random();
        ItemGenerator myGenerator = generatorList.get(random.nextInt(generatorList.size()));
        System.out.println(myGenerator.openReward());
    }
    private List<ItemGenerator> fillList(ItemGenerator gems, int gem, ItemGenerator golds, int gold,
                                         ItemGenerator silvers, int silver, ItemGenerator coppers, int copper){
        List<ItemGenerator> generatorList = new ArrayList<>();
        for (int i = 0; i < copper; i++) {
            generatorList.add(new CopperGenerator());
        }
        for (int i = 0; i < silver; i++) {
            generatorList.add(new SilverGenerator());
        }
        for (int i = 0; i < gold; i++) {
            generatorList.add(new GoldGenerator());
        }
        for (int i = 0; i < gem; i++) {
            generatorList.add(new GemGenerator());
        }
        return generatorList;
    }
}
