package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnResolver

@Generated
public fun cachingConfigProperty(initializer: CfnResolver.CachingConfigProperty.Builder.() -> Unit =
    {}): CfnResolver.CachingConfigProperty =
    CfnResolver.CachingConfigProperty.builder().apply(initializer).build()
