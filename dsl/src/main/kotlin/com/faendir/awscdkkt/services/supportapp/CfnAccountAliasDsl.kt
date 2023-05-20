@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.supportapp

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
import software.constructs.Construct

public fun Construct.cfnAccountAlias(
  id: String,
  props: CfnAccountAliasProps,
  initializer: CfnAccountAlias.() -> Unit = {},
): CfnAccountAlias = CfnAccountAlias(this, id, props).apply(initializer)
