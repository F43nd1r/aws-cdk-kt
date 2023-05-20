@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnMitigationAction
import software.amazon.awscdk.services.iot.CfnMitigationActionProps
import software.constructs.Construct

public fun Construct.cfnMitigationAction(
  id: String,
  props: CfnMitigationActionProps,
  initializer: CfnMitigationAction.() -> Unit = {},
): CfnMitigationAction = CfnMitigationAction(this, id, props).apply(initializer)
