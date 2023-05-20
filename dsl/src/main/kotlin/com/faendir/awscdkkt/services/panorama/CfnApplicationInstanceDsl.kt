@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
import software.constructs.Construct

public fun Construct.cfnApplicationInstance(
  id: String,
  props: CfnApplicationInstanceProps,
  initializer: CfnApplicationInstance.() -> Unit = {},
): CfnApplicationInstance = CfnApplicationInstance(this, id, props).apply(initializer)
