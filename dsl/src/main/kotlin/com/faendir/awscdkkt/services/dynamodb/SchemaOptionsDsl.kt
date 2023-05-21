package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.SchemaOptions

@Generated
public fun schemaOptions(initializer: SchemaOptions.Builder.() -> Unit = {}): SchemaOptions =
    SchemaOptions.builder().apply(initializer).build()
