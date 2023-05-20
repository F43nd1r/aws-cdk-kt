@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.PassProps
import software.constructs.Construct

public fun Construct.pass(id: String, initializer: Pass.() -> Unit = {}): Pass = Pass(this,
    id).apply(initializer)

public fun Construct.pass(
  id: String,
  props: PassProps,
  initializer: Pass.() -> Unit = {},
): Pass = Pass(this, id, props).apply(initializer)
