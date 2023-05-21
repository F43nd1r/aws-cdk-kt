package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LogRetentionRetryOptions

@Generated
public fun logRetentionRetryOptions(initializer: LogRetentionRetryOptions.Builder.() -> Unit = {}):
    LogRetentionRetryOptions = LogRetentionRetryOptions.builder().apply(initializer).build()
