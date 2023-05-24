package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDimension
import software.amazon.awscdk.services.iot.CfnDimensionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDimension(id: String, props: CfnDimensionProps): CfnDimension =
    CfnDimension(this, id, props)

@Generated
public fun Construct.cfnDimension(
  id: String,
  props: CfnDimensionProps,
  initializer: @AwsCdkDsl CfnDimension.() -> Unit,
): CfnDimension = CfnDimension(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDimension(id: String, initializer: @AwsCdkDsl
    CfnDimension.Builder.() -> Unit): CfnDimension = CfnDimension.Builder.create(this,
    id).apply(initializer).build()
