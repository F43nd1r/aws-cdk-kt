package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.SchemaBindOptions

@Generated
public fun schemaBindOptions(initializer: SchemaBindOptions.Builder.() -> Unit = {}):
    SchemaBindOptions = SchemaBindOptions.builder().apply(initializer).build()
