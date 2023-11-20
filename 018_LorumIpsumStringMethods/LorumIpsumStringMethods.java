public class LorumIpsumStringMethods
{
    public static void main(String[] args)
    {
        String LoremIpsumTuna = "tripod fish pineconefish Bengal danio king-of-the-salmon Asian carps, minnow zebra shark zebrafish southern grayling butterflyfish. Sockeye salmon Black pickerel Mexican golden trout European flounder; kelp perch bonnetmouth, Modoc sucker. Snipefish snake mackerel, zebra trout pikeblenny triplefin blenny sand tilefish, weasel shark angler catfish discus yellowfin tuna quillback splitfin. European perch bass salmon shark goatfish nase pelican gulper, burma danio, gar Antarctic cod sand goby. Pacific trout, sheepshead minnow pencilfish, stoneroller minnow. Stingfish torrent fish boafish jawfish garden eel zebra trout bandfish speckled trout sleeper slipmouth bullhead shark. Northern clingfish dogteeth tetra; broadband dogfish Mexican golden trout. Ghost knifefish; bobtail snipe eel, Manta Ray sea snail sole flyingfish. Steelhead gunnel Arctic char crestfish armorhead catfish, slender mola, wels catfish eel-goby ghost carp white shark. Oregon chub moonfish starry flounder rohu snake mackerel cuskfish killifish, butterflyfish cavefish Razorback sucker whalefish mouthbrooder glass catfish";

        System.out.println("The length of Lorem Ipsum Tuna version is " + LoremIpsumTuna.length());

        LoremIpsumTuna = "Sockeye salmon Black pickerel Mexican golden trout European flounder; kelp perch bonnetmouth, Modoc sucker. Snipefish snake mackerel, zebra trout pikeblenny triplefin blenny sand tilefish, weasel shark angler catfish discus yellowfin tuna quillback splitfin. European perch bass salmon shark goatfish nase pelican gulper, burma danio, gar Antarctic cod sand goby. Pacific trout, sheepshead minnow pencilfish, stoneroller minnow. Stingfish torrent fish boafish jawfish garden eel zebra trout bandfish speckled trout sleeper slipmouth bullhead shark. Northern clingfish dogteeth tetra; broadband dogfish Mexican golden trout. Ghost knifefish; bobtail snipe eel, Manta Ray sea snail sole flyingfish. Steelhead gunnel Arctic char crestfish armorhead catfish, slender mola, wels catfish eel-goby ghost carp white shark. Oregon chub moonfish starry flounder rohu snake mackerel cuskfish killifish, butterflyfish cavefish Razorback sucker whalefish mouthbrooder glass catfish";
    // above i am declaring a new variabel for loremipsumtuna so i dont need string in front of it 
        System.out.println("The new length of Lorem Ipsum Tuna version is " + LoremIpsumTuna.length());
// since code reads down the first print line reads the OG line but the one abve this reads the new declared one 
        System.out.println("In upper case it is " + LoremIpsumTuna.toUpperCase());
        System.out.println("In lower case it is " + LoremIpsumTuna.toLowerCase());
        System.out.println("The new blob is not equal to the orignal blob");
        System.out.println("The new blob is equal to the blob");
        System.out.println("The first instance of the letter Q is  " + LoremIpsumTuna.indexOf("q"));
        System.out.println("This is the blob with every o replaced with an X " + LoremIpsumTuna.replaceAll("o","x"));
        System.out.println("Lets see if this blob contains a z " + LoremIpsumTuna.indexOf("z"));
        // i hope it does have a z, becuase if it doesnt than i would have to use like an if statement so it would be like if indexOf(z)= true or whatever 
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/