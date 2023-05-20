@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps

public fun sqsEventSourceProps(initializer: SqsEventSourceProps.Builder.() -> Unit):
    SqsEventSourceProps = SqsEventSourceProps.builder().apply(initializer).build()
