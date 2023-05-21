package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps

@Generated
public fun sqsEventSourceProps(initializer: SqsEventSourceProps.Builder.() -> Unit = {}):
    SqsEventSourceProps = SqsEventSourceProps.builder().apply(initializer).build()
