package com.faendir.awscdkkt.generated.services.qbusiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qbusiness.CfnDataAccessor
import software.amazon.awscdk.services.qbusiness.CfnDataAccessorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataAccessor(
  id: String,
  props: CfnDataAccessorProps,
  initializer: @AwsCdkDsl CfnDataAccessor.() -> Unit = {},
): CfnDataAccessor = CfnDataAccessor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataAccessor(id: String, initializer: @AwsCdkDsl
    CfnDataAccessor.Builder.() -> Unit = {}): CfnDataAccessor = CfnDataAccessor.Builder.create(this,
    id).apply(initializer).build()
