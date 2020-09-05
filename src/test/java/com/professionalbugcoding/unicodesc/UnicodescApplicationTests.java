package com.professionalbugcoding.unicodesc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class UnicodescApplicationTests {

    /**
     * 生成Markdown格式文档
     * @throws Exception
     */
    @Test
    public void generateAsciiDocs() throws Exception {

//        URL remoteSwaggerFile = new URL("http://localhost:8080/v2/api-docs");
//        Path outputDirectory = Paths.get("src/docs/asciidoc/generated");
//
//        //    输出Ascii格式
//        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
//                .withMarkupLanguage(MarkupLanguage.ASCIIDOC)
//                .build();
//
//
//        Swagger2MarkupConverter.from(remoteSwaggerFile)
//                .withConfig(config)
//                .build()
//                .toFolder(outputDirectory);
    }

}
