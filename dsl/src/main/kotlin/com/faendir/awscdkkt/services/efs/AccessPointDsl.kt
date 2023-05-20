@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.AccessPointProps
import software.constructs.Construct

public fun Construct.accessPoint(
  id: String,
  props: AccessPointProps,
  initializer: AccessPoint.() -> Unit = {},
): AccessPoint = AccessPoint(this, id, props).apply(initializer)
