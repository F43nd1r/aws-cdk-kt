@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
import software.constructs.Construct

public fun Construct.cfnDetectorModel(
  id: String,
  props: CfnDetectorModelProps,
  initializer: CfnDetectorModel.() -> Unit = {},
): CfnDetectorModel = CfnDetectorModel(this, id, props).apply(initializer)
