class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean spy = false;
        if(knightIsAwake || archerIsAwake || prisonerIsAwake){
            spy = true;
        }
        return spy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal = false;
        if(prisonerIsAwake && !archerIsAwake){
            signal = true;
        }

        return signal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFree = false;
        if(petDogIsPresent && !archerIsAwake){
            canFree = true;
        }else if(!petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake){
            canFree = true;
        }

        return canFree;
    }
}
