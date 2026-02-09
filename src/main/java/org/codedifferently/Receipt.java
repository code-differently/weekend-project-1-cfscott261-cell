package org.codedifferently;


public class Receipt {

    // validate coupon code (case-insensitive)
    public boolean validateCoupon(String userCode) {
        String validCode = "SAVE10";

        return userCode.trim().equalsIgnoreCase(validCode);
    }

    // will be using part of customers first name
    public String buildReceiptCode(String name, int visitId) {
        String cleanedName = name.trim().toUpperCase();

        // first 3 letters of name + visit ID
        return cleanedName.substring(0, 3) + visitId;
    }


    public String formatOutput(String text) {
        return text.trim().toUpperCase();
    }



        public static void printReceipt(
                String storeName,
                int visitId,
                String receiptCode,
                double[] prices,
                double subtotal,
                double tax,
                double discountAmount,
                double total,
                double budget
        ) {

        }
    }




