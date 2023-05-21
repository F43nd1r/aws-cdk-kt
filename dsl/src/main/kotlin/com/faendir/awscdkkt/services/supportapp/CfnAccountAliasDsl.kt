package com.faendir.awscdkkt.services.supportapp

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
  initializer: CfnAccountAlias.() -> Unit = {},
): CfnAccountAlias = CfnAccountAlias(this, id, props).apply(initializer)
