package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVerifiedAccessInstance(id: String,
    initializer: CfnVerifiedAccessInstance.() -> Unit = {}): CfnVerifiedAccessInstance =
    CfnVerifiedAccessInstance(this, id).apply(initializer)

@Generated
public fun Construct.cfnVerifiedAccessInstance(
  id: String,
  props: CfnVerifiedAccessInstanceProps,
  initializer: CfnVerifiedAccessInstance.() -> Unit = {},
): CfnVerifiedAccessInstance = CfnVerifiedAccessInstance(this, id, props).apply(initializer)
