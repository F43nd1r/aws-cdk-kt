package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun globalSecondaryIndexProperty(initializer: CfnTable.GlobalSecondaryIndexProperty.Builder.() -> Unit
    = {}): CfnTable.GlobalSecondaryIndexProperty =
    CfnTable.GlobalSecondaryIndexProperty.builder().apply(initializer).build()
