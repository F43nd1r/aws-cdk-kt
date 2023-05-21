package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EksCall
import software.amazon.awscdk.services.stepfunctions.tasks.EksCallProps
import software.constructs.Construct

@Generated
public fun Construct.eksCall(
  id: String,
  props: EksCallProps,
  initializer: EksCall.() -> Unit = {},
): EksCall = EksCall(this, id, props).apply(initializer)
