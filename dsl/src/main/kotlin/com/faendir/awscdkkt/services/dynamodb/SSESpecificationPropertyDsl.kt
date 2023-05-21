package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun sSESpecificationProperty(initializer: CfnTable.SSESpecificationProperty.Builder.() -> Unit =
    {}): CfnTable.SSESpecificationProperty =
    CfnTable.SSESpecificationProperty.builder().apply(initializer).build()
