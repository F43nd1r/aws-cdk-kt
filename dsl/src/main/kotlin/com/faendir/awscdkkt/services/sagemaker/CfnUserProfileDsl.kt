@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
import software.constructs.Construct

public fun Construct.cfnUserProfile(
  id: String,
  props: CfnUserProfileProps,
  initializer: CfnUserProfile.() -> Unit = {},
): CfnUserProfile = CfnUserProfile(this, id, props).apply(initializer)
