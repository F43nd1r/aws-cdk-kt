package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.JsonSchema

@Generated
public fun jsonSchema(initializer: JsonSchema.Builder.() -> Unit = {}): JsonSchema =
    JsonSchema.builder().apply(initializer).build()
