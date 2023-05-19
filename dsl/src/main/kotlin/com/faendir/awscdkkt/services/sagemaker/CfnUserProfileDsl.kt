@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
