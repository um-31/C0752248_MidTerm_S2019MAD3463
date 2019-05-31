package com.lambton;

public class ToolsUsed {
    public static void main(String[] args) {
        LambtonStringTools obj =new LambtonStringTools();
        obj.reverse("Udhay");
        obj.binaryToDecimal("1010");
        obj.mostFrequent("Udhay");
        obj.mostFrequent("Mahajan");
        obj.initials("Udhay Mahajan");
        obj.initials("Udhay Madhu Mahajan");
        obj.replaceSubString("The Dog Jumped","the","that");

    }
}
