package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatabase(
  id: String,
  props: CfnDatabaseProps,
  initializer: @AwsCdkDsl CfnDatabase.() -> Unit = {},
): CfnDatabase = CfnDatabase(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDatabase(id: String, initializer: @AwsCdkDsl
    CfnDatabase.Builder.() -> Unit = {}): CfnDatabase = CfnDatabase.Builder.create(this,
    id).apply(initializer).build()
