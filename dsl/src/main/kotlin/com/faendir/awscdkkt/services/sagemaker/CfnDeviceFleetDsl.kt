@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps
import software.constructs.Construct

public fun Construct.cfnDeviceFleet(
  id: String,
  props: CfnDeviceFleetProps,
  initializer: CfnDeviceFleet.() -> Unit = {},
): CfnDeviceFleet = CfnDeviceFleet(this, id, props).apply(initializer)
