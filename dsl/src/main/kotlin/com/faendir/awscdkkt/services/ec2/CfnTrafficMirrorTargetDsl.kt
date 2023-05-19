@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps
import software.constructs.Construct

public fun Construct.cfnTrafficMirrorTarget(id: String,
    initializer: CfnTrafficMirrorTarget.() -> Unit = {}): CfnTrafficMirrorTarget =
    CfnTrafficMirrorTarget(this, id).apply(initializer)

public fun Construct.cfnTrafficMirrorTarget(
  id: String,
  props: CfnTrafficMirrorTargetProps,
  initializer: CfnTrafficMirrorTarget.() -> Unit = {},
): CfnTrafficMirrorTarget = CfnTrafficMirrorTarget(this, id, props).apply(initializer)
