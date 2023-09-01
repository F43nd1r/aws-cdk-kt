package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiRegionAccessPoint(
  id: String,
  props: CfnMultiRegionAccessPointProps,
  initializer: @AwsCdkDsl CfnMultiRegionAccessPoint.() -> Unit = {},
): CfnMultiRegionAccessPoint = CfnMultiRegionAccessPoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiRegionAccessPoint(id: String, initializer: @AwsCdkDsl
    CfnMultiRegionAccessPoint.Builder.() -> Unit = {}): CfnMultiRegionAccessPoint =
    CfnMultiRegionAccessPoint.Builder.create(this, id).apply(initializer).build()
