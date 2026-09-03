package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnEventTracker
import software.amazon.awscdk.services.personalize.CfnEventTrackerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventTracker(
  id: String,
  props: CfnEventTrackerProps,
  initializer: @AwsCdkDsl CfnEventTracker.() -> Unit = {},
): CfnEventTracker = CfnEventTracker(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventTracker(id: String, initializer: @AwsCdkDsl CfnEventTracker.Builder.() -> Unit = {}): CfnEventTracker = CfnEventTracker.Builder.create(this, id).apply(initializer).build()
