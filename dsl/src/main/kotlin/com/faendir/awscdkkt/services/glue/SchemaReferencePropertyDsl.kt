package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTable

@Generated
public fun schemaReferenceProperty(initializer: CfnTable.SchemaReferenceProperty.Builder.() -> Unit
    = {}): CfnTable.SchemaReferenceProperty =
    CfnTable.SchemaReferenceProperty.builder().apply(initializer).build()
