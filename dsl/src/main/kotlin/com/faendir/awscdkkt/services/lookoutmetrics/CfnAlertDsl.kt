@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps
import software.constructs.Construct

public fun Construct.cfnAlert(
  id: String,
  props: CfnAlertProps,
  initializer: CfnAlert.() -> Unit = {},
): CfnAlert = CfnAlert(this, id, props).apply(initializer)
