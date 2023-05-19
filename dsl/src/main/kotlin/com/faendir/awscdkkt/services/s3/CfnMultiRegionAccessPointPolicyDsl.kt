@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
