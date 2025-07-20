package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiRegionAccessPointPolicy(
  id: String,
  props: CfnMultiRegionAccessPointPolicyProps,
  initializer: @AwsCdkDsl CfnMultiRegionAccessPointPolicy.() -> Unit = {},
): CfnMultiRegionAccessPointPolicy = CfnMultiRegionAccessPointPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiRegionAccessPointPolicy(id: String, initializer: @AwsCdkDsl CfnMultiRegionAccessPointPolicy.Builder.() -> Unit = {}): CfnMultiRegionAccessPointPolicy = CfnMultiRegionAccessPointPolicy.Builder.create(this, id).apply(initializer).build()
