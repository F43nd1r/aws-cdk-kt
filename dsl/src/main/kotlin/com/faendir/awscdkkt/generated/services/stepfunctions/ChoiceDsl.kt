package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.ChoiceProps
import software.constructs.Construct

@Generated
public fun Construct.choice(id: String, initializer: @AwsCdkDsl Choice.() -> Unit = {}): Choice = Choice(this, id).apply(initializer)

@Generated
public fun Construct.choice(
  id: String,
  props: ChoiceProps,
  initializer: @AwsCdkDsl Choice.() -> Unit = {},
): Choice = Choice(this, id, props).apply(initializer)

@Generated
public fun Construct.buildChoice(id: String, initializer: @AwsCdkDsl Choice.Builder.() -> Unit = {}): Choice = Choice.Builder.create(this, id).apply(initializer).build()
