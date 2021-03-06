package com.yikolemon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data                              //get，set
@NoArgsConstructor                 //无参构造
@AllArgsConstructor                //有参构造
public class Tag implements Serializable {
    private static final long serialVersionUID = 6249938710570398244L;
    private Long id;
    @NotBlank(message = "名称不能为空")
    private String name;
}
