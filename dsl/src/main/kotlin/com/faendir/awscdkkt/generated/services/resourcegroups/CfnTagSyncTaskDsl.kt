package com.faendir.awscdkkt.generated.services.resourcegroups

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnTagSyncTask
import software.amazon.awscdk.services.resourcegroups.CfnTagSyncTaskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTagSyncTask(
  id: String,
  props: CfnTagSyncTaskProps,
  initializer: @AwsCdkDsl CfnTagSyncTask.() -> Unit = {},
): CfnTagSyncTask = CfnTagSyncTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTagSyncTask(id: String, initializer: @AwsCdkDsl CfnTagSyncTask.Builder.() -> Unit = {}): CfnTagSyncTask = CfnTagSyncTask.Builder.create(this, id).apply(initializer).build()
