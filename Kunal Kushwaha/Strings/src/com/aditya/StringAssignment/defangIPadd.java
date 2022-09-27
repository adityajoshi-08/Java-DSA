package com.aditya.StringAssignment;

class defangIPadd {
    public String defangIPaddr(String address) {
        StringBuilder newadd = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {

            if (address.charAt(i)== '.'){
                newadd.append("[.]");
            }else{
                newadd.append(address.charAt(i));
            }
        }
//        String ans =
        return newadd.toString();
    }
}