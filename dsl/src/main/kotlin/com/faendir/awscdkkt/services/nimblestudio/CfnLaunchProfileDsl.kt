@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
