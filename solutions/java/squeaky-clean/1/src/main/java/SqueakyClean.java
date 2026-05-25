class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean makeUpper = false;
        char currentChar = ' ';

        for(int i = 0; i < identifier.length(); i++){
            currentChar = identifier.charAt(i);

            switch(currentChar){
                case '4':
                    builder.append('a');
                    break;
                case '3':
                    builder.append('e');
                    break;
                case '0':
                    builder.append('o');
                    break;
                case '1':
                    builder.append('l');
                    break;
                case '7':
                    builder.append('t');
                    break;
                default:
                    if(makeUpper){
                        builder.append(Character.toUpperCase(currentChar));
                        makeUpper = false;
                    }else if(currentChar == ' '){
                        builder.append('_');
                    }else if(currentChar == '-'){
                        makeUpper = true;
                    }else if(Character.isLetter(currentChar)){
                        builder.append(currentChar);
                    }else{
                        
                    }
                    break;
            }
            
               
        }
        String cleanedString = builder.toString();
        return cleanedString;
    }
}
/*builder.append(identifier.charAt(i) == ' ' ? '_' : identifier.charAt(i));   */