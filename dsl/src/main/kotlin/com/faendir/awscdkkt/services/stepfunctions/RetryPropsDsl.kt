@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.RetryProps

public fun retryProps(initializer: RetryProps.Builder.() -> Unit): RetryProps =
    RetryProps.builder().apply(initializer).build()
