@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun globalSecondaryIndexProperty(initializer: CfnTable.GlobalSecondaryIndexProperty.Builder.() -> Unit):
    CfnTable.GlobalSecondaryIndexProperty =
    CfnTable.GlobalSecondaryIndexProperty.builder().apply(initializer).build()
