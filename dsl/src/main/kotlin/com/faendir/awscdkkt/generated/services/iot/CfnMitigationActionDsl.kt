package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.amazon.awscdk.services.iot.CfnMitigationActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMitigationAction(id: String, props: CfnMitigationActionProps):
    CfnMitigationAction = CfnMitigationAction(this, id, props)

@Generated
public fun Construct.cfnMitigationAction(
  id: String,
  props: CfnMitigationActionProps,
  initializer: @AwsCdkDsl CfnMitigationAction.() -> Unit,
): CfnMitigationAction = CfnMitigationAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMitigationAction(id: String, initializer: @AwsCdkDsl
    CfnMitigationAction.Builder.() -> Unit): CfnMitigationAction =
    CfnMitigationAction.Builder.create(this, id).apply(initializer).build()
