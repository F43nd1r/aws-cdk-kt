package com.faendir.awscdkkt.generated.services.opensearchservice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.LoggingOptions

@Generated
public fun buildLoggingOptions(initializer: @AwsCdkDsl LoggingOptions.Builder.() -> Unit = {}):
    LoggingOptions = LoggingOptions.Builder().apply(initializer).build()
