@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcProps
import software.constructs.Construct

public fun Construct.vpc(id: String, initializer: Vpc.() -> Unit = {}): Vpc = Vpc(this,
    id).apply(initializer)

public fun Construct.vpc(
  id: String,
  props: VpcProps,
  initializer: Vpc.() -> Unit = {},
): Vpc = Vpc(this, id, props).apply(initializer)
