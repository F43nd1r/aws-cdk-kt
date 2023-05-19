@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.FargateProfileProps
import software.constructs.Construct

public fun Construct.fargateProfile(
  id: String,
  props: FargateProfileProps,
  initializer: FargateProfile.() -> Unit = {},
): FargateProfile = FargateProfile(this, id, props).apply(initializer)
