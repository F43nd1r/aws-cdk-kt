package com.faendir.awscdkkt.services.nimblestudio

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudioComponent(
  id: String,
  props: CfnStudioComponentProps,
  initializer: CfnStudioComponent.() -> Unit = {},
): CfnStudioComponent = CfnStudioComponent(this, id, props).apply(initializer)
