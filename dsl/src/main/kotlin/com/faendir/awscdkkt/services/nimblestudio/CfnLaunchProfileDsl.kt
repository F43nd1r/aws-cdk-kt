@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.nimblestudio

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps
import software.constructs.Construct

public fun Construct.cfnLaunchProfile(
  id: String,
  props: CfnLaunchProfileProps,
  initializer: CfnLaunchProfile.() -> Unit = {},
): CfnLaunchProfile = CfnLaunchProfile(this, id, props).apply(initializer)
