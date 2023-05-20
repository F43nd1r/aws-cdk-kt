@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun kinesisStreamSpecificationProperty(initializer: CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit):
    CfnTable.KinesisStreamSpecificationProperty =
    CfnTable.KinesisStreamSpecificationProperty.builder().apply(initializer).build()
