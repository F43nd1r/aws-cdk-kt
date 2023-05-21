package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.RetryProps

@Generated
public fun retryProps(initializer: RetryProps.Builder.() -> Unit = {}): RetryProps =
    RetryProps.builder().apply(initializer).build()
