@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
import software.constructs.Construct

public fun Construct.cfnControlPanel(
  id: String,
  props: CfnControlPanelProps,
  initializer: CfnControlPanel.() -> Unit = {},
): CfnControlPanel = CfnControlPanel(this, id, props).apply(initializer)
