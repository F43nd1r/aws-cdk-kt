package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun streamSpecificationProperty(initializer: CfnTable.StreamSpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.StreamSpecificationProperty =
    CfnTable.StreamSpecificationProperty.builder().apply(initializer).build()
