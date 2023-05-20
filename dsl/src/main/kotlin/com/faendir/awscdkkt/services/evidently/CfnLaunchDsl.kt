@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.amazon.awscdk.services.evidently.CfnLaunchProps
import software.constructs.Construct

public fun Construct.cfnLaunch(
  id: String,
  props: CfnLaunchProps,
  initializer: CfnLaunch.() -> Unit = {},
): CfnLaunch = CfnLaunch(this, id, props).apply(initializer)
