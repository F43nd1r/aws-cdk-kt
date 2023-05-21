package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps

@Generated
public fun dynamoUpdateItemProps(initializer: DynamoUpdateItemProps.Builder.() -> Unit = {}):
    DynamoUpdateItemProps = DynamoUpdateItemProps.builder().apply(initializer).build()
