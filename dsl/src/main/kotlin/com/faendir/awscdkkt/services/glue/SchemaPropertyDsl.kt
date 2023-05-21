package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaVersion

@Generated
public fun schemaProperty(initializer: CfnSchemaVersion.SchemaProperty.Builder.() -> Unit = {}):
    CfnSchemaVersion.SchemaProperty =
    CfnSchemaVersion.SchemaProperty.builder().apply(initializer).build()
