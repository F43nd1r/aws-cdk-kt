@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.nimblestudio

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.amazon.awscdk.services.nimblestudio.CfnStudioProps
import software.constructs.Construct

public fun Construct.cfnStudio(
  id: String,
  props: CfnStudioProps,
  initializer: CfnStudio.() -> Unit = {},
): CfnStudio = CfnStudio(this, id, props).apply(initializer)
