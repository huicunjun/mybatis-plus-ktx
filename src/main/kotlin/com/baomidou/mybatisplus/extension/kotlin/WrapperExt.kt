package com.baomidou.mybatisplus.extension.kotlin

/**
 * @Author lidiwei
 * @CreateTime 2025/7/31 18:09
 */

inline fun <reified T : Any> buildKtQueryWrapperX(build: (KtQueryWrapperX<T>.() -> Unit)): KtQueryWrapperX<T> =
    KtQueryWrapperX(T::class.java).apply(build)

inline fun <reified T : Any> buildKtUpdateWrapper(build: KtUpdateWrapperX<T>.() -> Unit): KtUpdateWrapperX<T> =
    KtUpdateWrapperX(T::class.java).apply(build)
