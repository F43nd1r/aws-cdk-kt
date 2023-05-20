@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.SchemaOptions

public fun schemaOptions(initializer: SchemaOptions.Builder.() -> Unit): SchemaOptions =
    SchemaOptions.builder().apply(initializer).build()
