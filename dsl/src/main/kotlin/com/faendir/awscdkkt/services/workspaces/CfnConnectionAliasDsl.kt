package com.faendir.awscdkkt.services.workspaces

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectionAlias(
  id: String,
  props: CfnConnectionAliasProps,
  initializer: CfnConnectionAlias.() -> Unit = {},
): CfnConnectionAlias = CfnConnectionAlias(this, id, props).apply(initializer)
