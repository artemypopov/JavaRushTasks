package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        String headerText;

        public TableInterfaceWrapper(TableInterface tableInterface) {

        }

        @Override
        public void setModel(List rows) {
            System.out.println();
        }

        @Override
        public String getHeaderText() {
            return null;
        }

        @Override
        public void setHeaderText(String newHeaderText) {

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}