package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDiskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDisk(
  id: String,
  props: CfnDiskProps,
  initializer: CfnDisk.() -> Unit = {},
): CfnDisk = CfnDisk(this, id, props).apply(initializer)
