package com.company;

class Body extends Shop {

    private InsideSystemBlock insideSystemBlock;

    Body() {
        body_parts = false;
    }
    void BuyBody() {
        setBody_parts(true);
    }

    public void setBody_parts(boolean body_parts) {
        this.body_parts = body_parts;
    }

    public boolean isBody_parts() {
        return body_parts;
    }

    /*
     * Композиция
     */
    // Объект, в каком находится информация о том, что уже находится внутри.
    public InsideSystemBlock isInsideSystemBlock() {
        return insideSystemBlock;
    }

    // Смена объекта(смена внутренних деталей)
    public void setInsideSystemBlock(InsideSystemBlock insideSystemBlock) {
        this.insideSystemBlock = insideSystemBlock;
    }

    @Override
    public void show() {
        System.out.print("Have we bought body parts?");
        if(isBody_parts())
            System.out.println(" Yes.");
        else
            System.out.println(" No.");
    }
}
