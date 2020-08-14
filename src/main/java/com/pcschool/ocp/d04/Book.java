package com.pcschool.ocp.d04;

public class Book {
    private int pages = 200; // 預設最多頁數

    public Book() {
        this(10);
    }
    
    public Book(int pages) {
        if(pages > 0 && pages < this.pages)
            this.pages = pages; // this => 與物件變數作區別
    }

    @Override
    public String toString() {
        return "Book{" + "pages=" + pages + '}';
    }
    
}
