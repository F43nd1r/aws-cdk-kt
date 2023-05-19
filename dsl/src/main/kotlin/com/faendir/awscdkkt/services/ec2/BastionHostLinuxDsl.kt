@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.BastionHostLinux
import software.amazon.awscdk.services.ec2.BastionHostLinuxProps
import software.constructs.Construct

public fun Construct.bastionHostLinux(
  id: String,
  props: BastionHostLinuxProps,
  initializer: BastionHostLinux.() -> Unit = {},
): BastionHostLinux = BastionHostLinux(this, id, props).apply(initializer)
