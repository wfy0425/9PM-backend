package com.professionalbugcoding.unicodesc;

import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class UnicodescApplicationTests {

    /**
     * 生成Markdown格式文档
     * @throws Exception
     */
    @Test
    public void generateAsciiDocs() throws Exception {

        URL remoteSwaggerFile = new URL("http://localhost:8080/v2/api-docs");
        Path outputDirectory = Paths.get("src/docs/MARKDOWN/generated");

        //    输出Ascii格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                .build();


        Swagger2MarkupConverter.from(remoteSwaggerFile)
                .withConfig(config)
                .build()
                .toFolder(outputDirectory);
    }

}
