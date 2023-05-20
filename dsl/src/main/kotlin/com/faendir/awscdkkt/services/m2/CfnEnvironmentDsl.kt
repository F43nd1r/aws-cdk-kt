@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.m2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.m2.CfnEnvironment
import software.amazon.awscdk.services.m2.CfnEnvironmentProps
import software.constructs.Construct

public fun Construct.cfnEnvironment(
  id: String,
  props: CfnEnvironmentProps,
  initializer: CfnEnvironment.() -> Unit = {},
): CfnEnvironment = CfnEnvironment(this, id, props).apply(initializer)
