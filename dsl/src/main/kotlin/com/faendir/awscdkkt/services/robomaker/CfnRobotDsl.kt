@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.amazon.awscdk.services.robomaker.CfnRobotProps
import software.constructs.Construct

public fun Construct.cfnRobot(
  id: String,
  props: CfnRobotProps,
  initializer: CfnRobot.() -> Unit = {},
): CfnRobot = CfnRobot(this, id, props).apply(initializer)
