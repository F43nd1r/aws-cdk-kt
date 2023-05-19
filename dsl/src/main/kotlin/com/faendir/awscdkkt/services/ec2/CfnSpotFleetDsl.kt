@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnSpotFleetProps
import software.constructs.Construct

public fun Construct.cfnSpotFleet(
  id: String,
  props: CfnSpotFleetProps,
  initializer: CfnSpotFleet.() -> Unit = {},
): CfnSpotFleet = CfnSpotFleet(this, id, props).apply(initializer)
