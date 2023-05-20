@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps

public fun sqsEventSourceProps(initializer: SqsEventSourceProps.Builder.() -> Unit):
    SqsEventSourceProps = SqsEventSourceProps.builder().apply(initializer).build()
