package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.FargateProfile
import software.amazon.awscdk.services.eks_v2.FargateProfileProps
import software.constructs.Construct

@Generated
public fun Construct.fargateProfile(
  id: String,
  props: FargateProfileProps,
  initializer: @AwsCdkDsl FargateProfile.() -> Unit = {},
): FargateProfile = FargateProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFargateProfile(id: String, initializer: @AwsCdkDsl FargateProfile.Builder.() -> Unit = {}): FargateProfile = FargateProfile.Builder.create(this, id).apply(initializer).build()
