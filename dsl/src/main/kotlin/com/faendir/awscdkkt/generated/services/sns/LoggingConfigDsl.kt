package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.LoggingConfig

@Generated
public fun buildLoggingConfig(initializer: @AwsCdkDsl LoggingConfig.Builder.() -> Unit = {}):
    LoggingConfig = LoggingConfig.Builder().apply(initializer).build()
