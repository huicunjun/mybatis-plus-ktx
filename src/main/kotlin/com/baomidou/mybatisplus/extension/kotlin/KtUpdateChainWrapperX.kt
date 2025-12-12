/*
 * Copyright (c) 2011-2025, baomidou (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baomidou.mybatisplus.extension.kotlin

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import kotlin.reflect.KClass

/**
 * @author FlyInWind
 * @since 2020-10-18
 */
@Suppress("serial")
open class KtUpdateChainWrapperX<T : Any>(
    baseMapper: BaseMapper<T>?
) : KtUpdateChainWrapper<T>(baseMapper) {

    constructor(entityClass: KClass<T>) : this(null) {
        super.wrapperChildren = KtUpdateWrapper(entityClass.java)
    }
}
