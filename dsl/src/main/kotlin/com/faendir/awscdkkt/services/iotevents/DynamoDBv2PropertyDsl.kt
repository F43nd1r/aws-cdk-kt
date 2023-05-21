package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public fun dynamoDBv2Property(initializer: CfnDetectorModel.DynamoDBv2Property.Builder.() -> Unit =
    {}): CfnDetectorModel.DynamoDBv2Property =
    CfnDetectorModel.DynamoDBv2Property.builder().apply(initializer).build()
