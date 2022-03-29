package com.itacademy.java.oop.basics;

public enum ContractType {
        FULL_TIME,
        PART_TIME;

        public final String colourCode;

    HairColour(String colourCode) {
            this.colourCode = colourCode;
        }

    public static HairColour valueOfCode(String colourCode) {
            for (HairColour e : values()) {
                if (e.colourCode.equals(colourCode)) {
                    return e;
                }
            }
            return null;
        }

}
