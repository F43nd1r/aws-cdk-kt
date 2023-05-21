package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps

@Generated
public fun dynamoEventSourceProps(initializer: DynamoEventSourceProps.Builder.() -> Unit = {}):
    DynamoEventSourceProps = DynamoEventSourceProps.builder().apply(initializer).build()
