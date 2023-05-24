package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.RuntimeConfig

@Generated
public fun buildRuntimeConfig(initializer: @AwsCdkDsl RuntimeConfig.Builder.() -> Unit):
    RuntimeConfig = RuntimeConfig.Builder().apply(initializer).build()
