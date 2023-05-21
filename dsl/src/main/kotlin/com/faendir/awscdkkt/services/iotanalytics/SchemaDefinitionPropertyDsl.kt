package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun schemaDefinitionProperty(initializer: CfnDatastore.SchemaDefinitionProperty.Builder.() -> Unit
    = {}): CfnDatastore.SchemaDefinitionProperty =
    CfnDatastore.SchemaDefinitionProperty.builder().apply(initializer).build()
