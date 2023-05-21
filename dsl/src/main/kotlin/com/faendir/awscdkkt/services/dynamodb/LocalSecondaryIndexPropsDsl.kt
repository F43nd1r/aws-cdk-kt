package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps

@Generated
public fun localSecondaryIndexProps(initializer: LocalSecondaryIndexProps.Builder.() -> Unit = {}):
    LocalSecondaryIndexProps = LocalSecondaryIndexProps.builder().apply(initializer).build()
