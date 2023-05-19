@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
