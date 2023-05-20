@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.devicefarm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfile
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps
import software.constructs.Construct

public fun Construct.cfnInstanceProfile(
  id: String,
  props: CfnInstanceProfileProps,
  initializer: CfnInstanceProfile.() -> Unit = {},
): CfnInstanceProfile = CfnInstanceProfile(this, id, props).apply(initializer)
