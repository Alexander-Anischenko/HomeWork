package lesson10;

public class Variables {
    private int[] values = new int[26];

    public Integer getValue(String varName) {
        if(validateVarName(varName)) {
            return null;
        }
        int idx = varName.charAt(0) - 'a';
        return values[idx];
    }

    public void assignValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        String varValue = tokens[1].trim();
        // check variable name lenght
        if(validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    public boolean validateVarName(String varName) {
        if(varName.length() > 1) {
            System.out.println("Error, variable name  is too long");
            return false;
        }
        if (varName.isEmpty()) {
            System.out.println("Error, variable name  is empty");
            return false;
        }
        int idx = varName.charAt(0) - 'a';
        if (idx < 0 || idx > values.length - 1) {
            System.out.println("Error: variable name is invalid");
        }
        return true;
    }
}
