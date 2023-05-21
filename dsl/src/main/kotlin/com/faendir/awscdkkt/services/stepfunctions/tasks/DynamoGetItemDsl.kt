package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoGetItem(
  id: String,
  props: DynamoGetItemProps,
  initializer: DynamoGetItem.() -> Unit = {},
): DynamoGetItem = DynamoGetItem(this, id, props).apply(initializer)
