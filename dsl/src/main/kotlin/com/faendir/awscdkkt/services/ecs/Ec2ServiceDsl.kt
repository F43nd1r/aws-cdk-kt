@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
