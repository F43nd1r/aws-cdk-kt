@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnRoleAlias
import software.amazon.awscdk.services.iot.CfnRoleAliasProps
import software.constructs.Construct

public fun Construct.cfnRoleAlias(
  id: String,
  props: CfnRoleAliasProps,
  initializer: CfnRoleAlias.() -> Unit = {},
): CfnRoleAlias = CfnRoleAlias(this, id, props).apply(initializer)
