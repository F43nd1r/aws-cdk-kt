package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTrigger
import software.amazon.awscdk.services.glue.CfnTriggerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrigger(id: String, props: CfnTriggerProps): CfnTrigger = CfnTrigger(this,
    id, props)

@Generated
public fun Construct.cfnTrigger(
  id: String,
  props: CfnTriggerProps,
  initializer: @AwsCdkDsl CfnTrigger.() -> Unit,
): CfnTrigger = CfnTrigger(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrigger(id: String, initializer: @AwsCdkDsl
    CfnTrigger.Builder.() -> Unit): CfnTrigger = CfnTrigger.Builder.create(this,
    id).apply(initializer).build()
