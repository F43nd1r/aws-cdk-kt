@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

public fun dynamoDBProperty(initializer: CfnDetectorModel.DynamoDBProperty.Builder.() -> Unit):
    CfnDetectorModel.DynamoDBProperty =
    CfnDetectorModel.DynamoDBProperty.builder().apply(initializer).build()
