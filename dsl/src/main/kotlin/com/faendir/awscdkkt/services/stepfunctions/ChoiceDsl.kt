package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.ChoiceProps
import software.constructs.Construct

@Generated
public fun Construct.choice(id: String, initializer: Choice.() -> Unit = {}): Choice = Choice(this,
    id).apply(initializer)

@Generated
public fun Construct.choice(
  id: String,
  props: ChoiceProps,
  initializer: Choice.() -> Unit = {},
): Choice = Choice(this, id, props).apply(initializer)
