class Solution {
    public String intToRoman(int num) {
        // Define mappings of integer values to Roman numeral symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        // Iterate over the values and symbols
        for (int i = 0; i < values.length; i++) {
            // While the number is greater than or equal to the current value, append the symbol
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i]; // Subtract the value from the number
            }
        }
        
        return roman.toString(); // Return the final Roman numeral string
    }
}
