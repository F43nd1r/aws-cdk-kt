package com.faendir.awscdkkt.generated.services.supportapp

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccountAlias(
  id: String,
  props: CfnAccountAliasProps,
  initializer: @AwsCdkDsl CfnAccountAlias.() -> Unit = {},
): CfnAccountAlias = CfnAccountAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccountAlias(id: String, initializer: @AwsCdkDsl CfnAccountAlias.Builder.() -> Unit = {}): CfnAccountAlias = CfnAccountAlias.Builder.create(this, id).apply(initializer).build()
