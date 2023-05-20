@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnInstanceProps
import software.constructs.Construct

public fun Construct.cfnInstance(id: String, initializer: CfnInstance.() -> Unit = {}): CfnInstance
    = CfnInstance(this, id).apply(initializer)

public fun Construct.cfnInstance(
  id: String,
  props: CfnInstanceProps,
  initializer: CfnInstance.() -> Unit = {},
): CfnInstance = CfnInstance(this, id, props).apply(initializer)
