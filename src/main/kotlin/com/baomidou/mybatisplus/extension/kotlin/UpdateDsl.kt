package com.baomidou.mybatisplus.extension.kotlin

import com.baomidou.mybatisplus.core.conditions.update.Update
import kotlin.reflect.KProperty1

/**
 * @Author lidiwei
 * @CreateTime 2025/8/15 09:12
 */
interface UpdateDsl<Children, T> : Update<Children, KProperty1<in T, *>> {
    infix fun <V> KProperty1<in T, V>.set(value: V?) = this@UpdateDsl.set(this, value)
}
