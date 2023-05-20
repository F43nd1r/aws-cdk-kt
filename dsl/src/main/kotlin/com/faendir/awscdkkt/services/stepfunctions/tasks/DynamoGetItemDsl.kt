@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
import software.constructs.Construct

public fun Construct.dynamoGetItem(
  id: String,
  props: DynamoGetItemProps,
  initializer: DynamoGetItem.() -> Unit = {},
): DynamoGetItem = DynamoGetItem(this, id, props).apply(initializer)
