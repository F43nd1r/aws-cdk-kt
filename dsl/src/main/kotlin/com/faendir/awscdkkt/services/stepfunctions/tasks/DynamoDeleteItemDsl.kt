@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemProps
import software.constructs.Construct

public fun Construct.dynamoDeleteItem(
  id: String,
  props: DynamoDeleteItemProps,
  initializer: DynamoDeleteItem.() -> Unit = {},
): DynamoDeleteItem = DynamoDeleteItem(this, id, props).apply(initializer)
