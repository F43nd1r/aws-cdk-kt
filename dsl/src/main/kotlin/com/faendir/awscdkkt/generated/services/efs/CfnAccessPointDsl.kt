package com.faendir.awscdkkt.generated.services.efs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPointProps
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
