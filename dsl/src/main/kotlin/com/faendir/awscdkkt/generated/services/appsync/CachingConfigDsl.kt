package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CachingConfig

@Generated
public fun buildCachingConfig(initializer: @AwsCdkDsl CachingConfig.Builder.() -> Unit):
    CachingConfig = CachingConfig.Builder().apply(initializer).build()
