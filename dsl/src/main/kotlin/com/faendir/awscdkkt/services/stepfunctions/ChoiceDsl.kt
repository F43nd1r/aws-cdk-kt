@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.ChoiceProps
import software.constructs.Construct

public fun Construct.choice(id: String, initializer: Choice.() -> Unit = {}): Choice = Choice(this,
    id).apply(initializer)

public fun Construct.choice(
  id: String,
  props: ChoiceProps,
  initializer: Choice.() -> Unit = {},
): Choice = Choice(this, id, props).apply(initializer)
