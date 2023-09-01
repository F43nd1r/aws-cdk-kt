@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.LoggingOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.LoggingOptions is deprecated in CDK.")
@Generated
public fun buildLoggingOptions(initializer: @AwsCdkDsl LoggingOptions.Builder.() -> Unit = {}):
    LoggingOptions = LoggingOptions.Builder().apply(initializer).build()
