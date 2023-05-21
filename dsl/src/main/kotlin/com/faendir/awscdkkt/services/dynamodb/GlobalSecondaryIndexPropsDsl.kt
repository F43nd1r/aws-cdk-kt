package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps

@Generated
public fun globalSecondaryIndexProps(initializer: GlobalSecondaryIndexProps.Builder.() -> Unit =
    {}): GlobalSecondaryIndexProps = GlobalSecondaryIndexProps.builder().apply(initializer).build()
