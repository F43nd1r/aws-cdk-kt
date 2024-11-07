package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnDataMigration
import software.amazon.awscdk.services.dms.CfnDataMigrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataMigration(
  id: String,
  props: CfnDataMigrationProps,
  initializer: @AwsCdkDsl CfnDataMigration.() -> Unit = {},
): CfnDataMigration = CfnDataMigration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataMigration(id: String, initializer: @AwsCdkDsl
    CfnDataMigration.Builder.() -> Unit = {}): CfnDataMigration =
    CfnDataMigration.Builder.create(this, id).apply(initializer).build()
