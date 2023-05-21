package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationInstance(
  id: String,
  props: CfnApplicationInstanceProps,
  initializer: CfnApplicationInstance.() -> Unit = {},
): CfnApplicationInstance = CfnApplicationInstance(this, id, props).apply(initializer)
