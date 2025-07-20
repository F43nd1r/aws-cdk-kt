package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.constructs.Construct

@Generated
public fun Construct.activity(id: String, initializer: @AwsCdkDsl Activity.() -> Unit = {}): Activity = Activity(this, id).apply(initializer)

@Generated
public fun Construct.activity(
  id: String,
  props: ActivityProps,
  initializer: @AwsCdkDsl Activity.() -> Unit = {},
): Activity = Activity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildActivity(id: String, initializer: @AwsCdkDsl Activity.Builder.() -> Unit = {}): Activity = Activity.Builder.create(this, id).apply(initializer).build()
