@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
