package com.ruoyi.netmanager.constant;

/**
 * @author old.lazy.sexy
 * @description
 * @date 2023-10-12
 */
public enum ResourceTypeCategory {

    ResourceType_LogicalType_Cpu(DataDefine.ResourceType_LogicalType_Cpu,"处理器"),
    ResourceType_LogicalType_Memory(DataDefine.ResourceType_LogicalType_Memory,"内存"),
    ResourceType_LogicalType_Disk(DataDefine.ResourceType_LogicalType_Disk,"磁盘"),
    ResourceType_LogicalType_Interface(DataDefine.ResourceType_LogicalType_Interface,"网络接口"),
    ResourceType_LogicalType_Process(DataDefine.ResourceType_LogicalType_Process,"进程"),
    ResourceType_LogicalType_Service(DataDefine.ResourceType_LogicalType_Service,"服务"),
    ResourceType_LogicalType_DB(DataDefine.ResourceType_LogicalType_DB,"数据库"),
    ResourceType_LogicalType_Middleware(DataDefine.ResourceType_LogicalType_Middleware,"中间件"),
    ResourceType_LogicalType_JVMMemoryPool(DataDefine.ResourceType_LogicalType_JVMMemoryPool,"jvm内存池"),
    ResourceType_LogicalType_JVMGC(DataDefine.ResourceType_LogicalType_JVMGC,"jvm回收"),
    ResourceType_LogicalType_JVMNIOBufferPool(DataDefine.ResourceType_LogicalType_JVMNIOBufferPool,"jvm缓冲区"),
    ResourceType_LogicalType_JVMRuntime(DataDefine.ResourceType_LogicalType_JVMRuntime,"jvm虚拟机"),
    ResourceType_LogicalType_VMOS(DataDefine.ResourceType_LogicalType_VMOS,"虚拟系统"),
    ResourceType_LogicalType_CardSlot(DataDefine.ResourceType_LogicalType_CardSlot,"板槽"),
    ResourceType_LogicalType_BoardCard(DataDefine.ResourceType_LogicalType_BoardCard,"板卡"),
    NodeType_Category_Other("other","其他");

    private String categoryName;
    private String displayName;

    ResourceTypeCategory(String categoryName, String displayName) {
        this.categoryName = categoryName;
        this.displayName = displayName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 资源类型逻辑类型
     * @return
     */
    public static List<Category> takeCategoryList()
    {
        List<Category> categoryList = new ArrayList<Category>();
        for (ResourceTypeCategoryEnum resourceTypeCategoryEnum:ResourceTypeCategoryEnum.values()){
            categoryList.add(new Category(resourceTypeCategoryEnum.getCategoryName(),resourceTypeCategoryEnum.getDisplayName()));
        }
        return categoryList;
    }
}
