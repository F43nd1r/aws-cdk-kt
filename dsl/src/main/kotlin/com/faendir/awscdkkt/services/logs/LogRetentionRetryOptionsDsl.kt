@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions

public fun logRetentionRetryOptions(initializer: LogRetentionRetryOptions.Builder.() -> Unit):
    LogRetentionRetryOptions = LogRetentionRetryOptions.builder().apply(initializer).build()
