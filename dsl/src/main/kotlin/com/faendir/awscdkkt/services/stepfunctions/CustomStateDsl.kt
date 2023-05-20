@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
