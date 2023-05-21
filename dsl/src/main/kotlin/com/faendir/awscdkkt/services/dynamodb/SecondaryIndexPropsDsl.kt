package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.SecondaryIndexProps

@Generated
public fun secondaryIndexProps(initializer: SecondaryIndexProps.Builder.() -> Unit = {}):
    SecondaryIndexProps = SecondaryIndexProps.builder().apply(initializer).build()
