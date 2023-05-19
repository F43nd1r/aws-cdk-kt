@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps
import software.constructs.Construct

public fun Construct.dynamoUpdateItem(
  id: String,
  props: DynamoUpdateItemProps,
  initializer: DynamoUpdateItem.() -> Unit = {},
): DynamoUpdateItem = DynamoUpdateItem(this, id, props).apply(initializer)
