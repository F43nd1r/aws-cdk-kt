@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemProps
import software.constructs.Construct

public fun Construct.dynamoPutItem(
  id: String,
  props: DynamoPutItemProps,
  initializer: DynamoPutItem.() -> Unit = {},
): DynamoPutItem = DynamoPutItem(this, id, props).apply(initializer)
