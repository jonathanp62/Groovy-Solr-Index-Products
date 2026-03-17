package net.jmp.solr.index.products

/*
 * (#)Runner.groovy 1.0.0   03/17/2026
 *
 * @author    Jonathan Parker
 * @version   1.0.0
 * @since     1.0.0
 *
 * MIT License
 *
 * Copyright (c) 2026 Jonathan M. Parker
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * The runner class for the Solr index products application
 */
class Runner {
    /** The configuration */
    private Configuration configuration

    /** The version of the application */
    private String version

    /** The list of command line arguments */
    private List<String> args

    /**
     * The constructor
     *
     * @param configuration Configuration   The configuration
     * @param version       String          The version of the application
     * @param args          List<String>    The list of command line arguments
     */
    Runner(Configuration configuration,  String version, List<String> args) {
        this.configuration = configuration
        this.version = version
        this.args = args
    }
    /**
     * The run method for the application
     *
     * @return int  The exit code
     */
    int run() {
        println("Solr Index Products ${this.version}")

        return 0
    }
}
