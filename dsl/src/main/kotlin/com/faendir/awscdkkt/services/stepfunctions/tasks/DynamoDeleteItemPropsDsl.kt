package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemProps

@Generated
public fun dynamoDeleteItemProps(initializer: DynamoDeleteItemProps.Builder.() -> Unit = {}):
    DynamoDeleteItemProps = DynamoDeleteItemProps.builder().apply(initializer).build()
