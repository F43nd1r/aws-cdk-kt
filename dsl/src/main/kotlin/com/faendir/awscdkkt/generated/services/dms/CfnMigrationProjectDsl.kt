package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnMigrationProject
import software.amazon.awscdk.services.dms.CfnMigrationProjectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMigrationProject(id: String, initializer: @AwsCdkDsl CfnMigrationProject.() -> Unit = {}): CfnMigrationProject = CfnMigrationProject(this, id).apply(initializer)

@Generated
public fun Construct.cfnMigrationProject(
  id: String,
  props: CfnMigrationProjectProps,
  initializer: @AwsCdkDsl CfnMigrationProject.() -> Unit = {},
): CfnMigrationProject = CfnMigrationProject(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMigrationProject(id: String, initializer: @AwsCdkDsl CfnMigrationProject.Builder.() -> Unit = {}): CfnMigrationProject = CfnMigrationProject.Builder.create(this, id).apply(initializer).build()
