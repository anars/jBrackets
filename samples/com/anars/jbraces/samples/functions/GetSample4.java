/**
 * Copyright (c) 2012-2017 Anar Software LLC <http://anars.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is furnished 
 * to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS 
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION 
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.anars.jbraces.samples.functions;

import com.anars.jbraces.TemplateProcessor;

public class GetSample4 {

    public GetSample4() {
        TemplateProcessor templateProcessor = new TemplateProcessor();
        String[] favoriteLanguages = { "C", "C++", "Java", "Scala", "Python", "PHP" };
        templateProcessor.putValueObject("languages", favoriteLanguages);
        String template = "There are {get:languages.-length} favorite programming languages";
        System.out.println(template);
        template = templateProcessor.apply(template);
        System.out.println(template);
    }
    public static void main(String[] args) {
        new GetSample4();
    }
}
