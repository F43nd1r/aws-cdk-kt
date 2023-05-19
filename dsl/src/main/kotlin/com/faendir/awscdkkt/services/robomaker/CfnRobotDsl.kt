@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
