package com.crm.payload;

import java.util.Date;

public class ErrorDetails {

        private Date date;
        private String message;
        private String request;

        public ErrorDetails(String message, Date date, String request) {
            this.message = message;
            this.date = date;
            this.request = request;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getRequest() {
            return request;
        }

        public void setRequest(String request) {
            this.request = request;
        }
    }


