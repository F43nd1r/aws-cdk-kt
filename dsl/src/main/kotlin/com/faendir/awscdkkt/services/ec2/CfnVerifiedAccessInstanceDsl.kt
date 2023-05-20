@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
import software.constructs.Construct

public fun Construct.cfnVerifiedAccessInstance(id: String,
    initializer: CfnVerifiedAccessInstance.() -> Unit = {}): CfnVerifiedAccessInstance =
    CfnVerifiedAccessInstance(this, id).apply(initializer)

public fun Construct.cfnVerifiedAccessInstance(
  id: String,
  props: CfnVerifiedAccessInstanceProps,
  initializer: CfnVerifiedAccessInstance.() -> Unit = {},
): CfnVerifiedAccessInstance = CfnVerifiedAccessInstance(this, id, props).apply(initializer)
