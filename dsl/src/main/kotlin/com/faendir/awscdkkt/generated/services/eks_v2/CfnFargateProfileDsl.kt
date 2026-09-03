package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.CfnFargateProfile
import software.amazon.awscdk.services.eks_v2.CfnFargateProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFargateProfile(
  id: String,
  props: CfnFargateProfileProps,
  initializer: @AwsCdkDsl CfnFargateProfile.() -> Unit = {},
): CfnFargateProfile = CfnFargateProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFargateProfile(id: String, initializer: @AwsCdkDsl CfnFargateProfile.Builder.() -> Unit = {}): CfnFargateProfile = CfnFargateProfile.Builder.create(this, id).apply(initializer).build()
