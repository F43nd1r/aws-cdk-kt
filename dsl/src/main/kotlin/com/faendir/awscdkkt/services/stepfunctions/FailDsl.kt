@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Fail
import software.amazon.awscdk.services.stepfunctions.FailProps
import software.constructs.Construct

public fun Construct.fail(id: String, initializer: Fail.() -> Unit = {}): Fail = Fail(this,
    id).apply(initializer)

public fun Construct.fail(
  id: String,
  props: FailProps,
  initializer: Fail.() -> Unit = {},
): Fail = Fail(this, id, props).apply(initializer)
