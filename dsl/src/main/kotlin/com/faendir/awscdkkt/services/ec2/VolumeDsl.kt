package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Volume
import software.amazon.awscdk.services.ec2.VolumeProps
import software.constructs.Construct

@Generated
public fun Construct.volume(
  id: String,
  props: VolumeProps,
  initializer: Volume.() -> Unit = {},
): Volume = Volume(this, id, props).apply(initializer)
