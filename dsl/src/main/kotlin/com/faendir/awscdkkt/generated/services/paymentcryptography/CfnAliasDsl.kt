package com.faendir.awscdkkt.generated.services.paymentcryptography

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.paymentcryptography.CfnAlias
import software.amazon.awscdk.services.paymentcryptography.CfnAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlias(
  id: String,
  props: CfnAliasProps,
  initializer: @AwsCdkDsl CfnAlias.() -> Unit = {},
): CfnAlias = CfnAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAlias(id: String, initializer: @AwsCdkDsl CfnAlias.Builder.() -> Unit =
    {}): CfnAlias = CfnAlias.Builder.create(this, id).apply(initializer).build()
