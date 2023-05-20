@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
