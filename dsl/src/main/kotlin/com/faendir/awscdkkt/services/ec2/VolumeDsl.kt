@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Volume
import software.amazon.awscdk.services.ec2.VolumeProps
import software.constructs.Construct

public fun Construct.volume(
  id: String,
  props: VolumeProps,
  initializer: Volume.() -> Unit = {},
): Volume = Volume(this, id, props).apply(initializer)
