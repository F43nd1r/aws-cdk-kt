package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserProfile(id: String, props: CfnUserProfileProps): CfnUserProfile =
    CfnUserProfile(this, id, props)

@Generated
public fun Construct.cfnUserProfile(
  id: String,
  props: CfnUserProfileProps,
  initializer: @AwsCdkDsl CfnUserProfile.() -> Unit,
): CfnUserProfile = CfnUserProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserProfile(id: String, initializer: @AwsCdkDsl
    CfnUserProfile.Builder.() -> Unit): CfnUserProfile = CfnUserProfile.Builder.create(this,
    id).apply(initializer).build()
