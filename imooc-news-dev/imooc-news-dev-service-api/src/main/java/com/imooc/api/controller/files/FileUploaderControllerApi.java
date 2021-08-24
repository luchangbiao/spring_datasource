package com.imooc.api.controller.files;

import com.imooc.grace.result.GraceJSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Api(value = "文件上传的Controller", tags = {"文件上传的Controller"})
@RequestMapping("fs")
public interface FileUploaderControllerApi {

    /**
     * 上传单文件
     *
     * @param userId
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/uploadFace")
    public GraceJSONResult uploadFace(@RequestParam String userId,
                                      MultipartFile file) throws Exception;


}
