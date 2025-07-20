package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnEventTrigger
import software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventTrigger(
  id: String,
  props: CfnEventTriggerProps,
  initializer: @AwsCdkDsl CfnEventTrigger.() -> Unit = {},
): CfnEventTrigger = CfnEventTrigger(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventTrigger(id: String, initializer: @AwsCdkDsl CfnEventTrigger.Builder.() -> Unit = {}): CfnEventTrigger = CfnEventTrigger.Builder.create(this, id).apply(initializer).build()
