package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.AccessPointProps
import software.constructs.Construct

@Generated
public fun Construct.accessPoint(
  id: String,
  props: AccessPointProps,
  initializer: AccessPoint.() -> Unit = {},
): AccessPoint = AccessPoint(this, id, props).apply(initializer)
