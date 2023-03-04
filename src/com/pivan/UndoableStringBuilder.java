package com.pivan;

import java.util.Stack;

public class UndoableStringBuilder {
    private StringBuilder stringBuilder;

    private Stack<Action> actions = new Stack<>();

    private interface Action{
        void undo();
    }

    public UndoableStringBuilder(){
        stringBuilder = new StringBuilder();
    }

//    private class DeleteAction implements Action{
//        private int size;
//
//        public DeleteAction(int size){
//            this.size = size;
//        }
//
//        @Override
//        public void undo() {
//            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
//        }
//    }

    public UndoableStringBuilder reverse() {
        stringBuilder.reverse();

        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.reverse();
            }
        };

        actions.add(action);
        return this;
    }

    public UndoableStringBuilder append(String str) {

        stringBuilder.append(str);

        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length());
            }
        };

        actions.add(action);

        return this;
    }

    public UndoableStringBuilder appendCodePoint(int codePoint) {
        stringBuilder.appendCodePoint(codePoint);
        actions.add(() -> stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()));
        return this;
    }

    public void undo(){
        if(!actions.isEmpty()){
            actions.pop().undo();
        }
    }

    public String toString(){
        return stringBuilder.toString();
    }

}
