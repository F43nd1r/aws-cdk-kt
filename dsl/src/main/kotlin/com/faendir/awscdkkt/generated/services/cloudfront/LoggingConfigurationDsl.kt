package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration

@Generated
public fun buildLoggingConfiguration(initializer: @AwsCdkDsl
    LoggingConfiguration.Builder.() -> Unit): LoggingConfiguration =
    LoggingConfiguration.Builder().apply(initializer).build()
