@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
