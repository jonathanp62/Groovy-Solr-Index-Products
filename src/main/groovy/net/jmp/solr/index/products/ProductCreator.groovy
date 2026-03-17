package net.jmp.solr.index.products

/*
 * (#)ProductCreator.groovy 1.0.0   03/17/2026
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
 * The product creator class
 */
class ProductCreator {
    static List<Product> createProducts() {
        List<Product> products = []

        Product product004 = new Product()
        Product product005 = new Product()
        Product product006 = new Product()

        product004.id = "PROD-004"
        product004.name = "32 inch curved computer monitor"
        product004.description = "Premium 32 inch curved computer monitor compatible with Windows and Mac"
        product004.category = "Electonics"
        product004.brand = "Dell"
        product004.price = 799.99
        product004.inStock = true
        product004.tags = ["monitor", "curved", "computer", "electronic", "premium"]

        product005.id = "PROD-005"
        product005.name = "Gold pen and pencil set"
        product005.description = "Classic gold roller ball pen and mechanical pencil set complete with ink and lead refills"
        product005.category = "Writing Instruments"
        product005.brand = "Cross"
        product005.price = 89.99
        product005.inStock = true
        product005.tags = ["pen", "pencil", "roller ball", "mechanical", "gold"]

        product006.id = "PROD-006"
        product006.name = "Desk-sized dry erase board"
        product006.description = "Desk-sized dry erase board that includes both eraser and four colored markers"
        product006.category = "Writing Instruments"
        product006.brand = "Quartet"
        product006.price = 29.95
        product006.inStock = false
        product006.tags = ["board", "dry erase", "eraser", "markers"]

        products.add(product004)
        products.add(product005)
        products.add(product006)

        return products
    }
}
