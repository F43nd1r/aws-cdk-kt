@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnInstanceProps
import software.constructs.Construct

public fun Construct.cfnInstance(
  id: String,
  props: CfnInstanceProps,
  initializer: CfnInstance.() -> Unit = {},
): CfnInstance = CfnInstance(this, id, props).apply(initializer)
