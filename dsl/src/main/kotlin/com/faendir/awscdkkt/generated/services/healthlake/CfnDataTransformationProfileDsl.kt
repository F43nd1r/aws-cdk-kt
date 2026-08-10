package com.faendir.awscdkkt.generated.services.healthlake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnDataTransformationProfile
import software.amazon.awscdk.services.healthlake.CfnDataTransformationProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataTransformationProfile(
  id: String,
  props: CfnDataTransformationProfileProps,
  initializer: @AwsCdkDsl CfnDataTransformationProfile.() -> Unit = {},
): CfnDataTransformationProfile = CfnDataTransformationProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataTransformationProfile(id: String, initializer: @AwsCdkDsl CfnDataTransformationProfile.Builder.() -> Unit = {}): CfnDataTransformationProfile = CfnDataTransformationProfile.Builder.create(this, id).apply(initializer).build()
