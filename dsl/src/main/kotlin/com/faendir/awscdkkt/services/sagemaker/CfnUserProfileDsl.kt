package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserProfile(
  id: String,
  props: CfnUserProfileProps,
  initializer: CfnUserProfile.() -> Unit = {},
): CfnUserProfile = CfnUserProfile(this, id, props).apply(initializer)
