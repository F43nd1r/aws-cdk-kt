@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnVolume
import software.amazon.awscdk.services.opsworks.CfnVolumeProps
import software.constructs.Construct

public fun Construct.cfnVolume(
  id: String,
  props: CfnVolumeProps,
  initializer: CfnVolume.() -> Unit = {},
): CfnVolume = CfnVolume(this, id, props).apply(initializer)
