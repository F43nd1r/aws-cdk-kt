package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoUpdateItem(
  id: String,
  props: DynamoUpdateItemProps,
  initializer: DynamoUpdateItem.() -> Unit = {},
): DynamoUpdateItem = DynamoUpdateItem(this, id, props).apply(initializer)
