package cn.bctools.gateway.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Administrator
 */
@Data
@Accessors(chain = true)
@TableName(value = "sys_gateway_route")
public class GatewayRoutePo {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    @ApiModelProperty("请求路径")
    private String path;
    @ApiModelProperty("请求地址")
    private String uri;

}
