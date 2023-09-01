package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildKeySchemaProperty(initializer: @AwsCdkDsl
    CfnTable.KeySchemaProperty.Builder.() -> Unit = {}): CfnTable.KeySchemaProperty =
    CfnTable.KeySchemaProperty.Builder().apply(initializer).build()
