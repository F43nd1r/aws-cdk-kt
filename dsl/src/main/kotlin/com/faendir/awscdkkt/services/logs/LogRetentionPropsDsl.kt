package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetentionProps

@Generated
public fun logRetentionProps(initializer: LogRetentionProps.Builder.() -> Unit = {}):
    LogRetentionProps = LogRetentionProps.builder().apply(initializer).build()
