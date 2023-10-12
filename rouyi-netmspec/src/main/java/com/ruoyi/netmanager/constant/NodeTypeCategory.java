package com.ruoyi.netmanager.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author old.lazy.sexy
 * @description 设备类型
 * @date 2023-10-12
 */
@Getter
@AllArgsConstructor
public enum NodeTypeCategory {
    NodeType_Category_Server("服务器","服务器.png"),
    NodeType_Category_PC("PC","PC.png"),
    NodeType_Category_Equipment("网络设备","AP.png"),
    NodeType_Category_Database("数据库","数据库.png"),
    NodeType_Category_Firewall("防火墙","防火墙.png"),
    NodeType_Category_VirtualMachine("虚拟机","虚拟机.png"),
    NodeType_Category_Balance("负载均衡","balance.png"),
    NodeType_Category_Middleware("中间件","中间件.png"),
    NodeType_Category_Switch("交换机","交换机.png"),
    NodeType_Category_Router("路由器","路由器.png"),
    NodeType_Category_Other("其他","default.png"),
    NodeType_Category_ProcessNode("途经设备","across.png"),
    NodeType_Category_Flow("流量设备","flow.png");

    private String type;
    private String img;

    public static List<String> getAllNodeType(){
        List<String> result = new ArrayList<>();
        for(NodeTypeCategory nodeTypeCategoryEnum : NodeTypeCategory.values()){
            result.add(nodeTypeCategoryEnum.getType());
        }
        return result;
    }

    public static List<Map<String, String>> getAllNodeTypeCategory(){
        List<Map<String, String>> result = new ArrayList<>();
        for(NodeTypeCategory nodeTypeCategoryEnum : NodeTypeCategory.values()){
            Map<String, String> map = new HashMap<>();
            map.put("key", nodeTypeCategoryEnum.getType());
            map.put("value", nodeTypeCategoryEnum.getImg());
            result.add(map);
        }
        return result;
    }

}
