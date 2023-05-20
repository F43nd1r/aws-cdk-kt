@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnProfile
import software.amazon.awscdk.services.transfer.CfnProfileProps
import software.constructs.Construct

public fun Construct.cfnProfile(
  id: String,
  props: CfnProfileProps,
  initializer: CfnProfile.() -> Unit = {},
): CfnProfile = CfnProfile(this, id, props).apply(initializer)
