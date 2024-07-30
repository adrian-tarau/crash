package org.crsh.standalone;

import java.io.IOException;

class VirtualMachine {

    static VirtualMachine attach(int pid) {
        return new VirtualMachine();
    }

    public void detach() throws IOException {

    }

    public void loadAgent(String agent, String options) {

    }

}
