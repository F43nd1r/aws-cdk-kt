@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
