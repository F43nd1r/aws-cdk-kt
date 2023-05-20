@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions

public fun logRetentionRetryOptions(initializer: LogRetentionRetryOptions.Builder.() -> Unit):
    LogRetentionRetryOptions = LogRetentionRetryOptions.builder().apply(initializer).build()
