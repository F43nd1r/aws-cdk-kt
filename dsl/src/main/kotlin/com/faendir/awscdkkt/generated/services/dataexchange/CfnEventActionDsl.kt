package com.faendir.awscdkkt.generated.services.dataexchange

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dataexchange.CfnEventAction
import software.amazon.awscdk.services.dataexchange.CfnEventActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventAction(
  id: String,
  props: CfnEventActionProps,
  initializer: @AwsCdkDsl CfnEventAction.() -> Unit = {},
): CfnEventAction = CfnEventAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventAction(id: String, initializer: @AwsCdkDsl CfnEventAction.Builder.() -> Unit = {}): CfnEventAction = CfnEventAction.Builder.create(this, id).apply(initializer).build()
