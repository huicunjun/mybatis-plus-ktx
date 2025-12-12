package com.baomidou.mybatisplus.extension.kotlin

/**
 * @Author lidiwei
 * @CreateTime 2025/8/1 08:50
 */
class KtUpdateWrapperX<T : Any> : KtUpdateWrapper<T>,
    CompareDsl<KtUpdateWrapper<T>, T>,
    FuncDsl<KtUpdateWrapper<T>, T>,
    UpdateDsl<KtUpdateWrapper<T>, T> {

    constructor(entity: T) : super(entity)
    constructor(entityClass: Class<T>) : super(entityClass)
}
