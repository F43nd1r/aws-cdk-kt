package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnTracker
import software.amazon.awscdk.services.location.CfnTrackerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTracker(
  id: String,
  props: CfnTrackerProps,
  initializer: @AwsCdkDsl CfnTracker.() -> Unit = {},
): CfnTracker = CfnTracker(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTracker(id: String, initializer: @AwsCdkDsl CfnTracker.Builder.() -> Unit = {}): CfnTracker = CfnTracker.Builder.create(this, id).apply(initializer).build()
