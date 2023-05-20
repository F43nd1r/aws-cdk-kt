@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVolume
import software.amazon.awscdk.services.ec2.CfnVolumeProps
import software.constructs.Construct

public fun Construct.cfnVolume(
  id: String,
  props: CfnVolumeProps,
  initializer: CfnVolume.() -> Unit = {},
): CfnVolume = CfnVolume(this, id, props).apply(initializer)
