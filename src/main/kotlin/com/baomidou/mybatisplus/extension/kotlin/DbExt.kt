package com.baomidou.mybatisplus.extension.kotlin

import kotlin.reflect.KClass

/**
 * @Author lidiwei
 * @CreateTime 2025/7/31 16:15
 */

inline fun <reified T : Any> ktQuery(noinline query: (KtQueryChainWrapperX<T>.() -> Unit)? = null): KtQueryChainWrapperX<T> =
    KtQueryChainWrapperX(T::class).also { query?.invoke(it) }

inline fun <reified T : Any, C : KClass<T>> C.ktQuery(noinline query: (KtQueryChainWrapperX<T>.() -> Unit)? = null): KtQueryChainWrapperX<T> =
    KtQueryChainWrapperX(T::class).also { query?.invoke(it) }
