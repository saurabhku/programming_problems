/*
 * text =>   Hello, How are you ?
style =>  1,3,bold # 1,3,italic # 5,9,underline
response =>  <b><i>He</b></i>ll<u>o, H</u>ow are you ?
 */


import org.apache.commons.lang3.StringUtils;

public class TagAdder {
    public String solution(String instructions, String input)
    {
        String output="";
        if(StringUtils.isEmpty(input) || StringUtils.isEmpty(instructions)) {
            return input;
        }

        String[] tagsApplied = new String[input.length()+1];
        char[] charArray = input.toCharArray();
        for( int count =0; count< charArray.length+1; count++ ) {
            tagsApplied[count] = "";
        }

        String[] instructionsArray = instructions.split("#");

        for(String instruction : instructionsArray) {

            String[] partsOfInstruction = instruction.split(",");
            int startIndex = Integer.parseInt(partsOfInstruction[0].trim()) - 1;
            tagsApplied[startIndex] = tagsApplied[startIndex] + getStartingTagForOperation(partsOfInstruction[2].trim());
            int endIndex = Integer.parseInt(partsOfInstruction[1].trim()) - 1;
            tagsApplied[endIndex] = tagsApplied[endIndex] + getEndingTagForOperation(partsOfInstruction[2].trim());
        }

        int count=0;
        for( ;count< charArray.length; count++ ) {
            output = output+ tagsApplied[count]+ charArray[count] ;
        }
        output = output+tagsApplied[count];
        return output;
    }

    private  String getEndingTagForOperation(String operation) {
        switch(operation.trim()) {
            case "bold" :
                return "</b>";
            case "italic":
                return "</i>";
            case "underline":
                return "</u>";
            case "body":
                return "</body>";
        }
        return null;
    }

    private  String getStartingTagForOperation(String operation) {
        switch(operation.trim()) {
            case "bold" :
                return "<b>";
            case "italic":
                return "<i>";
            case "underline":
                return "<u>";
            case "body":
                return "<body>";
        }
        return null;
    }
}
