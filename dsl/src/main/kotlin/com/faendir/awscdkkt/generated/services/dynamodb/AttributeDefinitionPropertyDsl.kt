package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildAttributeDefinitionProperty(initializer: @AwsCdkDsl
    CfnTable.AttributeDefinitionProperty.Builder.() -> Unit = {}):
    CfnTable.AttributeDefinitionProperty =
    CfnTable.AttributeDefinitionProperty.Builder().apply(initializer).build()
