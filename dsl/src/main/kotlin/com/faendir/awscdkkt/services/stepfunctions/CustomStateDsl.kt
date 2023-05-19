@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CustomState
import software.amazon.awscdk.services.stepfunctions.CustomStateProps
import software.constructs.Construct

public fun Construct.customState(
  id: String,
  props: CustomStateProps,
  initializer: CustomState.() -> Unit = {},
): CustomState = CustomState(this, id, props).apply(initializer)
