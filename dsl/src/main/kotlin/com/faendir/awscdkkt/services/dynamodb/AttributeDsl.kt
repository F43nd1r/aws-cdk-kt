package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Attribute

@Generated
public fun attribute(initializer: Attribute.Builder.() -> Unit = {}): Attribute =
    Attribute.builder().apply(initializer).build()
