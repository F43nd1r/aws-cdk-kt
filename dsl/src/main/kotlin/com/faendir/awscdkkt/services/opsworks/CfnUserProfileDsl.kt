package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnUserProfile
import software.amazon.awscdk.services.opsworks.CfnUserProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserProfile(
  id: String,
  props: CfnUserProfileProps,
  initializer: CfnUserProfile.() -> Unit = {},
): CfnUserProfile = CfnUserProfile(this, id, props).apply(initializer)
