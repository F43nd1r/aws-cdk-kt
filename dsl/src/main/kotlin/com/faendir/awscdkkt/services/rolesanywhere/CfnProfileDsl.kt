@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rolesanywhere

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnProfile
import software.amazon.awscdk.services.rolesanywhere.CfnProfileProps
import software.constructs.Construct

public fun Construct.cfnProfile(
  id: String,
  props: CfnProfileProps,
  initializer: CfnProfile.() -> Unit = {},
): CfnProfile = CfnProfile(this, id, props).apply(initializer)
