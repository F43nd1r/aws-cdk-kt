package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun attributeDefinitionProperty(initializer: CfnTable.AttributeDefinitionProperty.Builder.() -> Unit
    = {}): CfnTable.AttributeDefinitionProperty =
    CfnTable.AttributeDefinitionProperty.builder().apply(initializer).build()
