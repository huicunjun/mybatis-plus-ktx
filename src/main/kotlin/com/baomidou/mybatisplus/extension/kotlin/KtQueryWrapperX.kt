package com.baomidou.mybatisplus.extension.kotlin

import com.baomidou.mybatisplus.core.conditions.SharedString
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments
import java.util.concurrent.atomic.AtomicInteger

/**
 * @Author lidiwei
 * @CreateTime 2025/8/1 08:50
 */
class KtQueryWrapperX<T : Any> : KtQueryWrapper<T>,
    CompareDsl<KtQueryWrapper<T>, T>,
    FuncDsl<KtQueryWrapper<T>, T> {

    constructor(entity: T) : super(entity)
    constructor(entityClass: Class<T>) : super(entityClass)

    /**
     * 转成string 的queryWrapper
     */
    val queryWrapper: MyQueryWrapper<T>
        get() = MyQueryWrapper<T>(
            entity,
            entityClass,
            paramNameSeq,
            paramNameValuePairs,
            expression,
            paramAlias,
            lastSql,
            sqlComment,
            sqlFirst,
            sqlSelect
        )
}

class MyQueryWrapper<T : Any>(entityClass: Class<T>) : QueryWrapper<T>(entityClass) {
    constructor(
        entity: T?,
        entityClass: Class<T>,
        paramNameSeq: AtomicInteger?,
        paramNameValuePairs: MutableMap<String?, Any?>?,
        mergeSegments: MergeSegments?,
        paramAlias: SharedString?,
        lastSql: SharedString?,
        sqlComment: SharedString?,
        sqlFirst: SharedString?,
        sqlSelect: String?,
    ) : this(entityClass) {
        super.setEntity(entity)
        super.setEntityClass(entityClass)
        this.paramNameSeq = paramNameSeq
        this.paramNameValuePairs = paramNameValuePairs
        this.expression = mergeSegments
        this.paramAlias = paramAlias
        this.lastSql = lastSql
        this.sqlComment = sqlComment
        this.sqlFirst = sqlFirst
        this.sqlSelect.stringValue = sqlSelect
    }

}
