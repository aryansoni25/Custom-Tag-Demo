package com.telusko;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class ProductTag extends SimpleTagSupport {

    private int prodId;
    private String name;
    private String category;
    private double price;

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void doTag() throws JspException, IOException {

        JspWriter out = getJspContext().getOut();

        out.println("<h2>Product Details</h2>");

        out.println("<table border='1' cellpadding='10'>");

        out.println("<tr><th>Product ID</th><td>" + prodId + "</td></tr>");
        out.println("<tr><th>Name</th><td>" + name + "</td></tr>");
        out.println("<tr><th>Category</th><td>" + category + "</td></tr>");
        out.println("<tr><th>Price</th><td>" + price + "</td></tr>");

        out.println("</table>");
    }
}