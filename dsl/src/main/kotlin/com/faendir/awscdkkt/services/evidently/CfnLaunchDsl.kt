@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
