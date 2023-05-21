package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.amazon.awscdk.services.eks.CfnFargateProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFargateProfile(
  id: String,
  props: CfnFargateProfileProps,
  initializer: CfnFargateProfile.() -> Unit = {},
): CfnFargateProfile = CfnFargateProfile(this, id, props).apply(initializer)
