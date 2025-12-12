package com.baomidou.mybatisplus.extension.kotlin

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import org.apache.ibatis.session.ResultHandler

/**
 * @Author lidiwei
 * @CreateTime 2025/7/31 10:13
 */

inline fun <reified T : Any> BaseMapper<T>.delete(build: (KtQueryWrapperX<T>.() -> Unit)): Int =
    this.delete(buildKtQueryWrapperX(build))

inline fun <reified T : Any> BaseMapper<T>.update(
    entity: T,
    build: (KtUpdateWrapperX<T>.() -> Unit)
): Int =
    this.update(entity, buildKtUpdateWrapper(build))

inline fun <reified T : Any> BaseMapper<T>.update(build: (KtUpdateWrapperX<T>.() -> Unit)): Int =
    this.update(buildKtUpdateWrapper(build))

inline fun <reified T : Any> BaseMapper<T>.selectOne(
    throwEx: Boolean = true,
    build: (KtQueryWrapperX<T>.() -> Unit),
): T? =
    this.selectOne(buildKtQueryWrapperX(build), throwEx)

inline fun <reified T : Any> BaseMapper<T>.exists(build: (KtQueryWrapperX<T>.() -> Unit)): Boolean =
    this.exists(buildKtQueryWrapperX(build))

inline fun <reified T : Any> BaseMapper<T>.notExists(build: (KtQueryWrapperX<T>.() -> Unit)): Boolean =
    !this.exists(buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectCount(build: (KtQueryWrapperX<T>.() -> Unit)): Long =
    this.selectCount(buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectList(build: (KtQueryWrapperX<T>.() -> Unit)): List<T> =
    this.selectList(buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectList(
    page: IPage<T>,
    build: (KtQueryWrapperX<T>.() -> Unit),
): List<T> =
    this.selectList(page, buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectList(
    build: (KtQueryWrapperX<T>.() -> Unit),
    resultHandler: ResultHandler<T>
) = this.selectList(buildKtQueryWrapperX<T>(build), resultHandler)

inline fun <reified T : Any> BaseMapper<T>.selectList(
    page: IPage<T>,
    build: (KtQueryWrapperX<T>.() -> Unit),
    resultHandler: ResultHandler<T>
) = this.selectList(page, buildKtQueryWrapperX<T>(build), resultHandler)

inline fun <reified T : Any> BaseMapper<T>.selectMaps(
    build: (KtQueryWrapperX<T>.() -> Unit),
): List<Map<String, Any>> = this.selectMaps(buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectMaps(
    page: IPage<Map<String, Any>>? = null,
    build: (KtQueryWrapperX<T>.() -> Unit),
): List<Map<String, Any>> = this.selectMaps(page, buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectMaps(
    build: (KtQueryWrapperX<T>.() -> Unit),
    resultHandler: ResultHandler<Map<String, Any>>
) = this.selectMaps(buildKtQueryWrapperX<T>(build), resultHandler)

inline fun <reified T : Any> BaseMapper<T>.selectMaps(
    page: IPage<Map<String, Any>>? = null,
    build: (KtQueryWrapperX<T>.() -> Unit),
    resultHandler: ResultHandler<Map<String, Any>>
) = this.selectMaps(page, buildKtQueryWrapperX<T>(build), resultHandler)

inline fun <reified T : Any, P : IPage<Map<String, Any>>> BaseMapper<T>.selectMapsPage(
    page: P? = null,
    build: (KtQueryWrapperX<T>.() -> Unit),
) = this.selectMapsPage(page, buildKtQueryWrapperX<T>(build))

inline fun <reified T : Any> BaseMapper<T>.selectPage(
    page: IPage<T>,
    build: (KtQueryWrapperX<T>.() -> Unit),
): IPage<T> =
    this.selectPage(page, buildKtQueryWrapperX<T>(build))


inline fun <reified T : Any> BaseMapper<T>.insert(entity: T): T {
    this.insert(entity)
    return entity
}
