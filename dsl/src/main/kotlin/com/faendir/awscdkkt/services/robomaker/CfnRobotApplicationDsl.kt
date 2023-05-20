@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
import software.constructs.Construct

public fun Construct.cfnRobotApplication(
  id: String,
  props: CfnRobotApplicationProps,
  initializer: CfnRobotApplication.() -> Unit = {},
): CfnRobotApplication = CfnRobotApplication(this, id, props).apply(initializer)
