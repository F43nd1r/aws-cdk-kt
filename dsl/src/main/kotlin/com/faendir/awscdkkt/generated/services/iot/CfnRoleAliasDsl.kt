package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnRoleAlias
import software.amazon.awscdk.services.iot.CfnRoleAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoleAlias(
  id: String,
  props: CfnRoleAliasProps,
  initializer: @AwsCdkDsl CfnRoleAlias.() -> Unit = {},
): CfnRoleAlias = CfnRoleAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRoleAlias(id: String, initializer: @AwsCdkDsl
    CfnRoleAlias.Builder.() -> Unit = {}): CfnRoleAlias = CfnRoleAlias.Builder.create(this,
    id).apply(initializer).build()
