package com.faendir.awscdkkt.generated.services.mgn

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mgn.CfnNetworkMigrationDefinition
import software.amazon.awscdk.services.mgn.CfnNetworkMigrationDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkMigrationDefinition(
  id: String,
  props: CfnNetworkMigrationDefinitionProps,
  initializer: @AwsCdkDsl CfnNetworkMigrationDefinition.() -> Unit = {},
): CfnNetworkMigrationDefinition = CfnNetworkMigrationDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkMigrationDefinition(id: String, initializer: @AwsCdkDsl CfnNetworkMigrationDefinition.Builder.() -> Unit = {}): CfnNetworkMigrationDefinition = CfnNetworkMigrationDefinition.Builder.create(this, id).apply(initializer).build()
