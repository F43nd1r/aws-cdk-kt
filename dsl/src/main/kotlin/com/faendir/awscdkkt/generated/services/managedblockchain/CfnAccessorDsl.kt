package com.faendir.awscdkkt.generated.services.managedblockchain

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnAccessor
import software.amazon.awscdk.services.managedblockchain.CfnAccessorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessor(
  id: String,
  props: CfnAccessorProps,
  initializer: @AwsCdkDsl CfnAccessor.() -> Unit = {},
): CfnAccessor = CfnAccessor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessor(id: String, initializer: @AwsCdkDsl
    CfnAccessor.Builder.() -> Unit = {}): CfnAccessor = CfnAccessor.Builder.create(this,
    id).apply(initializer).build()
