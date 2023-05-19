@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
