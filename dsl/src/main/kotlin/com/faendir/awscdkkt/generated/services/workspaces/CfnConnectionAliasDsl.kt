package com.faendir.awscdkkt.generated.services.workspaces

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectionAlias(id: String, props: CfnConnectionAliasProps):
    CfnConnectionAlias = CfnConnectionAlias(this, id, props)

@Generated
public fun Construct.cfnConnectionAlias(
  id: String,
  props: CfnConnectionAliasProps,
  initializer: @AwsCdkDsl CfnConnectionAlias.() -> Unit,
): CfnConnectionAlias = CfnConnectionAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectionAlias(id: String, initializer: @AwsCdkDsl
    CfnConnectionAlias.Builder.() -> Unit): CfnConnectionAlias =
    CfnConnectionAlias.Builder.create(this, id).apply(initializer).build()
