package com.faendir.awscdkkt.generated.services.route53recoverycontrol

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoutingControl(id: String, props: CfnRoutingControlProps): CfnRoutingControl
    = CfnRoutingControl(this, id, props)

@Generated
public fun Construct.cfnRoutingControl(
  id: String,
  props: CfnRoutingControlProps,
  initializer: @AwsCdkDsl CfnRoutingControl.() -> Unit,
): CfnRoutingControl = CfnRoutingControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRoutingControl(id: String, initializer: @AwsCdkDsl
    CfnRoutingControl.Builder.() -> Unit): CfnRoutingControl =
    CfnRoutingControl.Builder.create(this, id).apply(initializer).build()
