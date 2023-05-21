package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcProps
import software.constructs.Construct

@Generated
public fun Construct.vpc(id: String, initializer: Vpc.() -> Unit = {}): Vpc = Vpc(this,
    id).apply(initializer)

@Generated
public fun Construct.vpc(
  id: String,
  props: VpcProps,
  initializer: Vpc.() -> Unit = {},
): Vpc = Vpc(this, id, props).apply(initializer)
