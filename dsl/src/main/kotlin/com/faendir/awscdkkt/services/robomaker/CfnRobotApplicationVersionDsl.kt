@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps
import software.constructs.Construct

public fun Construct.cfnRobotApplicationVersion(
  id: String,
  props: CfnRobotApplicationVersionProps,
  initializer: CfnRobotApplicationVersion.() -> Unit = {},
): CfnRobotApplicationVersion = CfnRobotApplicationVersion(this, id, props).apply(initializer)
