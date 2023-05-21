package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun keySchemaProperty(initializer: CfnTable.KeySchemaProperty.Builder.() -> Unit = {}):
    CfnTable.KeySchemaProperty = CfnTable.KeySchemaProperty.builder().apply(initializer).build()
