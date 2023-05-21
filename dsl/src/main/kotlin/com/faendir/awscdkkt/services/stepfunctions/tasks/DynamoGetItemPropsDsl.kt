package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps

@Generated
public fun dynamoGetItemProps(initializer: DynamoGetItemProps.Builder.() -> Unit = {}):
    DynamoGetItemProps = DynamoGetItemProps.builder().apply(initializer).build()
