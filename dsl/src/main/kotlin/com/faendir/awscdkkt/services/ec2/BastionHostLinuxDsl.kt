@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
