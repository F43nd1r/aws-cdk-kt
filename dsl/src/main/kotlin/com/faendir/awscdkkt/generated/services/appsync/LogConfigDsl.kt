package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.LogConfig

@Generated
public fun buildLogConfig(initializer: @AwsCdkDsl LogConfig.Builder.() -> Unit = {}): LogConfig =
    LogConfig.Builder().apply(initializer).build()
