package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun projectionProperty(initializer: CfnTable.ProjectionProperty.Builder.() -> Unit = {}):
    CfnTable.ProjectionProperty = CfnTable.ProjectionProperty.builder().apply(initializer).build()
