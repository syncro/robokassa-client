package ru.robokassa.robokassaclient;



public class Payment {

    private String invoiceRef;

    private String comment;

    private String commentData;

    private int amount;

    public String getInvoiceRef() {
        return invoiceRef;
    }

    public void setInvoiceRef(String invoiceRef) {
        this.invoiceRef = invoiceRef;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentData() {
        return commentData;
    }

    public void setCommentData(String commentData) {
        this.commentData = commentData;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
