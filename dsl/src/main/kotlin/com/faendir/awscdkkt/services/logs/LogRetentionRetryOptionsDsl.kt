package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions

@Generated
public fun logRetentionRetryOptions(initializer: LogRetentionRetryOptions.Builder.() -> Unit = {}):
    LogRetentionRetryOptions = LogRetentionRetryOptions.builder().apply(initializer).build()
