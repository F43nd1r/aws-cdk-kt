@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
