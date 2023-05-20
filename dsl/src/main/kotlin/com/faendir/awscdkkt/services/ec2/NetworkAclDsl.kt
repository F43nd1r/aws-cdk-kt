@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.constructs.Construct

public fun Construct.networkAcl(
  id: String,
  props: NetworkAclProps,
  initializer: NetworkAcl.() -> Unit = {},
): NetworkAcl = NetworkAcl(this, id, props).apply(initializer)
