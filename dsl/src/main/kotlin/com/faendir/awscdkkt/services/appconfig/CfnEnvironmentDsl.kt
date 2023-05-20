@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.amazon.awscdk.services.appconfig.CfnEnvironmentProps
import software.constructs.Construct

public fun Construct.cfnEnvironment(
  id: String,
  props: CfnEnvironmentProps,
  initializer: CfnEnvironment.() -> Unit = {},
): CfnEnvironment = CfnEnvironment(this, id, props).apply(initializer)
