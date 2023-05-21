package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun dynamoDBEventProperty(initializer: CfnFunction.DynamoDBEventProperty.Builder.() -> Unit =
    {}): CfnFunction.DynamoDBEventProperty =
    CfnFunction.DynamoDBEventProperty.builder().apply(initializer).build()
