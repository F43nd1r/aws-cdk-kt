package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRobotApplication(
  id: String,
  props: CfnRobotApplicationProps,
  initializer: CfnRobotApplication.() -> Unit = {},
): CfnRobotApplication = CfnRobotApplication(this, id, props).apply(initializer)
