@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
import software.constructs.Construct

public fun Construct.cfnMultiRegionAccessPointPolicy(
  id: String,
  props: CfnMultiRegionAccessPointPolicyProps,
  initializer: CfnMultiRegionAccessPointPolicy.() -> Unit = {},
): CfnMultiRegionAccessPointPolicy = CfnMultiRegionAccessPointPolicy(this, id,
    props).apply(initializer)
