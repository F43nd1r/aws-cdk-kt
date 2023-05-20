@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun sSESpecificationProperty(initializer: CfnTable.SSESpecificationProperty.Builder.() -> Unit):
    CfnTable.SSESpecificationProperty =
    CfnTable.SSESpecificationProperty.builder().apply(initializer).build()
