@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps

public fun dynamoEventSourceProps(initializer: DynamoEventSourceProps.Builder.() -> Unit):
    DynamoEventSourceProps = DynamoEventSourceProps.builder().apply(initializer).build()
