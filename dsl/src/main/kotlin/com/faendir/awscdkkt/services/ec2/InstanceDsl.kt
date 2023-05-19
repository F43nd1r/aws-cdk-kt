@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InstanceProps
import software.constructs.Construct

public fun Construct.instance(
  id: String,
  props: InstanceProps,
  initializer: Instance.() -> Unit = {},
): Instance = Instance(this, id, props).apply(initializer)
