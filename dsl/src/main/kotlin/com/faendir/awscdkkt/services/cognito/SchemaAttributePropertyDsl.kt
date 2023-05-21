package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun schemaAttributeProperty(initializer: CfnUserPool.SchemaAttributeProperty.Builder.() -> Unit
    = {}): CfnUserPool.SchemaAttributeProperty =
    CfnUserPool.SchemaAttributeProperty.builder().apply(initializer).build()
