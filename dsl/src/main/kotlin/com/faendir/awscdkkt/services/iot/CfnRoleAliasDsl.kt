package com.faendir.awscdkkt.services.iot

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
  initializer: CfnRoleAlias.() -> Unit = {},
): CfnRoleAlias = CfnRoleAlias(this, id, props).apply(initializer)
