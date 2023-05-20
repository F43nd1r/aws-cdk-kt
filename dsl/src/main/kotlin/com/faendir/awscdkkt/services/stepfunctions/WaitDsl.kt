@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Wait
import software.amazon.awscdk.services.stepfunctions.WaitProps
import software.constructs.Construct

public fun Construct.wait(
  id: String,
  props: WaitProps,
  initializer: Wait.() -> Unit = {},
): Wait = Wait(this, id, props).apply(initializer)
