package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.FargateProfileProps
import software.constructs.Construct

@Generated
public fun Construct.fargateProfile(id: String, props: FargateProfileProps): FargateProfile =
    FargateProfile(this, id, props)

@Generated
public fun Construct.fargateProfile(
  id: String,
  props: FargateProfileProps,
  initializer: @AwsCdkDsl FargateProfile.() -> Unit,
): FargateProfile = FargateProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFargateProfile(id: String, initializer: @AwsCdkDsl
    FargateProfile.Builder.() -> Unit): FargateProfile = FargateProfile.Builder.create(this,
    id).apply(initializer).build()
