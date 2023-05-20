@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

public fun dynamoDBProperty(initializer: CfnDetectorModel.DynamoDBProperty.Builder.() -> Unit):
    CfnDetectorModel.DynamoDBProperty =
    CfnDetectorModel.DynamoDBProperty.builder().apply(initializer).build()
