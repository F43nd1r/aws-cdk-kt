package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfile
import software.amazon.awscdk.services.bedrock.CfnApplicationInferenceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationInferenceProfile(
  id: String,
  props: CfnApplicationInferenceProfileProps,
  initializer: @AwsCdkDsl CfnApplicationInferenceProfile.() -> Unit = {},
): CfnApplicationInferenceProfile = CfnApplicationInferenceProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationInferenceProfile(id: String, initializer: @AwsCdkDsl CfnApplicationInferenceProfile.Builder.() -> Unit = {}): CfnApplicationInferenceProfile = CfnApplicationInferenceProfile.Builder.create(this, id).apply(initializer).build()
