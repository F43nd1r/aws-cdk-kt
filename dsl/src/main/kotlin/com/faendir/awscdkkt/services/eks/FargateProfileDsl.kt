package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.FargateProfileProps
import software.constructs.Construct

@Generated
public fun Construct.fargateProfile(
  id: String,
  props: FargateProfileProps,
  initializer: FargateProfile.() -> Unit = {},
): FargateProfile = FargateProfile(this, id, props).apply(initializer)
