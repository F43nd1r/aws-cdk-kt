@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
