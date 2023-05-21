package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CachingConfig

@Generated
public fun cachingConfig(initializer: CachingConfig.Builder.() -> Unit = {}): CachingConfig =
    CachingConfig.builder().apply(initializer).build()
