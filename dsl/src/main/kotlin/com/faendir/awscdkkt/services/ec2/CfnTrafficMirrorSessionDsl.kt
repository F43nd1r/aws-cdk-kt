@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps
import software.constructs.Construct

public fun Construct.cfnTrafficMirrorSession(
  id: String,
  props: CfnTrafficMirrorSessionProps,
  initializer: CfnTrafficMirrorSession.() -> Unit = {},
): CfnTrafficMirrorSession = CfnTrafficMirrorSession(this, id, props).apply(initializer)
