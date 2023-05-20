@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
import software.constructs.Construct

public fun Construct.cfnRoutingControl(
  id: String,
  props: CfnRoutingControlProps,
  initializer: CfnRoutingControl.() -> Unit = {},
): CfnRoutingControl = CfnRoutingControl(this, id, props).apply(initializer)
