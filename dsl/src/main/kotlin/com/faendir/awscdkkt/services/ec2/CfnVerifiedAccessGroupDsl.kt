@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps
import software.constructs.Construct

public fun Construct.cfnVerifiedAccessGroup(
  id: String,
  props: CfnVerifiedAccessGroupProps,
  initializer: CfnVerifiedAccessGroup.() -> Unit = {},
): CfnVerifiedAccessGroup = CfnVerifiedAccessGroup(this, id, props).apply(initializer)