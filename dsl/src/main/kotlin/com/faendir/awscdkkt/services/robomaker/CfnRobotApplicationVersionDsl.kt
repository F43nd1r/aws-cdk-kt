@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
