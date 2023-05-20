@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
