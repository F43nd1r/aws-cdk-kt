package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public fun dynamoDBProperty(initializer: CfnDetectorModel.DynamoDBProperty.Builder.() -> Unit = {}):
    CfnDetectorModel.DynamoDBProperty =
    CfnDetectorModel.DynamoDBProperty.builder().apply(initializer).build()
