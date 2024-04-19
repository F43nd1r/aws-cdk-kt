package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnMeteredProduct
import software.amazon.awscdk.services.deadline.CfnMeteredProductProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMeteredProduct(id: String, initializer: @AwsCdkDsl
    CfnMeteredProduct.() -> Unit = {}): CfnMeteredProduct = CfnMeteredProduct(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnMeteredProduct(
  id: String,
  props: CfnMeteredProductProps,
  initializer: @AwsCdkDsl CfnMeteredProduct.() -> Unit = {},
): CfnMeteredProduct = CfnMeteredProduct(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMeteredProduct(id: String, initializer: @AwsCdkDsl
    CfnMeteredProduct.Builder.() -> Unit = {}): CfnMeteredProduct =
    CfnMeteredProduct.Builder.create(this, id).apply(initializer).build()
