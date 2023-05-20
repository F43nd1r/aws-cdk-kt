@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.amazon.awscdk.services.eks.CfnFargateProfileProps
import software.constructs.Construct

public fun Construct.cfnFargateProfile(
  id: String,
  props: CfnFargateProfileProps,
  initializer: CfnFargateProfile.() -> Unit = {},
): CfnFargateProfile = CfnFargateProfile(this, id, props).apply(initializer)
