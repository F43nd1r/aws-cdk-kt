package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.SchemaProps

@Generated
public fun schemaProps(initializer: SchemaProps.Builder.() -> Unit = {}): SchemaProps =
    SchemaProps.builder().apply(initializer).build()
