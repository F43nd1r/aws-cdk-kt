package com.faendir.awscdkkt.generated.services.s3objectlambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessPoint(id: String, props: CfnAccessPointProps): CfnAccessPoint =
    CfnAccessPoint(this, id, props)

@Generated
public fun Construct.cfnAccessPoint(
  id: String,
  props: CfnAccessPointProps,
  initializer: @AwsCdkDsl CfnAccessPoint.() -> Unit,
): CfnAccessPoint = CfnAccessPoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessPoint(id: String, initializer: @AwsCdkDsl
    CfnAccessPoint.Builder.() -> Unit): CfnAccessPoint = CfnAccessPoint.Builder.create(this,
    id).apply(initializer).build()
