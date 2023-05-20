@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2Service
import software.amazon.awscdk.services.ecs.Ec2ServiceProps
import software.constructs.Construct

public fun Construct.ec2Service(
  id: String,
  props: Ec2ServiceProps,
  initializer: Ec2Service.() -> Unit = {},
): Ec2Service = Ec2Service(this, id, props).apply(initializer)
